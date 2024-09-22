package com.dbms.smartstock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SupplierInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String supplierId;

    private String supplierName;

    private String contactAddress;

    private String contactNo;

    private String email;

    private String upiId;

    private String suppBankAccNo;

    private String ifscNo;
}
