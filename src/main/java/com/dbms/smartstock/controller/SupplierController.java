package com.dbms.smartstock.controller;

import com.dbms.smartstock.model.InventoryAlert;
import com.dbms.smartstock.services.InventoryAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    InventoryAlertService inventoryAlertService;
    @GetMapping("/alerts")
    public List<InventoryAlert> getAllAlerts(){
        return inventoryAlertService.getAlerts();
    }
}
