/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventoryservice.controllers;

import com.inventoryservice.models.Inventory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AKulkarni17
 */
@RestController
public class InventoryController {

    List<Inventory> inventoryList = new ArrayList<>();

    @GetMapping("/inventory/{productID}")
    public Inventory getInventoryDetails(@PathVariable Long productID) {
        Inventory inventory = getInventoryInfo(productID);
        return inventory;
    }

    public Inventory getInventoryInfo(Long productID) {
        populateInventoryList();
        for (Inventory inventory : inventoryList) {
            if (productID.equals(inventory.getProductID())) {
                return inventory;
            }
        }
        return null;
    }

    private void populateInventoryList() {
        inventoryList.add(new Inventory(101L, 101L, true));
        inventoryList.add(new Inventory(102L, 102L, true));
        inventoryList.add(new Inventory(102L, 103L, false));
        inventoryList.add(new Inventory(104L, 104L, false));
        inventoryList.add(new Inventory(105L, 105L, true));
    }
}
