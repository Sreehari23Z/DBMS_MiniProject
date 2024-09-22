package com.dbms.smartstock.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InventoryAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long alertNo;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supplier_Id")
    private SupplierInfo supplier;

    private int quantityOfOrder;

    @Enumerated(EnumType.STRING)
    private AlertType alertType;
}
