package com.dbms.smartstock.services;

import com.dbms.smartstock.model.AlertType;
import com.dbms.smartstock.model.InventoryAlert;
import com.dbms.smartstock.model.Product;
import com.dbms.smartstock.repository.AlertRepository;
import com.dbms.smartstock.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryAlertService {

    @Autowired
    private AlertRepository alertRepository;

    @Autowired
    private ProductRepository productRepository;

    @Scheduled(cron = "${inventory.update.cron}")
    public void updateInventoryAlert(){
        System.out.println("Checking inventory update");
        List<Product> products = productRepository.findByStockQuantityLessThanAlarmQuantity();
        for(Product product : products){
            InventoryAlert inventoryAlert;
            inventoryAlert = alertRepository.findByProduct(product);
            if(inventoryAlert!=null){
                if(inventoryAlert.getAlertType()== AlertType.LOW && product.getStockQuantity()<=0) {
                    inventoryAlert.setAlertType(AlertType.OUT_OF_STOCK);
                    alertRepository.save(inventoryAlert);
                }
            }else {
                inventoryAlert = new InventoryAlert();
                inventoryAlert.setAlertType(product.getStockQuantity()<=0 ? AlertType.OUT_OF_STOCK : AlertType.LOW);
                inventoryAlert.setProduct(product);
                inventoryAlert.setSupplier(product.getSupplier());
                inventoryAlert.setQuantityOfOrder(product.getStockQuantity());
                alertRepository.save(inventoryAlert);
            }
        }
    }
}
