package com.dbms.smartstock.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private String productName;

    private String category;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierInfo supplierId;

    private int stockQuantity;

    private int alarmQuantity;

    private float mrp;

    private float buyingConst;

    private Date latestStockDate;

}
