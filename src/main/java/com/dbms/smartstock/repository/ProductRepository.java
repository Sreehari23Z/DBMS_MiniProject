package com.dbms.smartstock.repository;

import com.dbms.smartstock.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT p FROM Product p WHERE p.stockQuantity <= p.alarmQuantity")
    List<Product> findByStockQuantityLessThanAlarmQuantity();
}
