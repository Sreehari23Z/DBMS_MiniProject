package com.dbms.smartstock.repository;

import com.dbms.smartstock.model.InventoryAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<InventoryAlert,Long> {
}
