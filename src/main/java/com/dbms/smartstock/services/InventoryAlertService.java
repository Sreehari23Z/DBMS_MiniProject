package com.dbms.smartstock.services;

import com.dbms.smartstock.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryAlertService {

    @Autowired
    private AlertRepository alertRepository;


}
