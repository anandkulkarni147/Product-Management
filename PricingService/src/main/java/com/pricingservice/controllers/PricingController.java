/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricingservice.controllers;

import com.pricingservice.models.Price;
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
public class PricingController {

    List<Price> priceList = new ArrayList<>();

    @GetMapping("/price/{productID}")
    public Price getProductDetails(@PathVariable Long productID) {
        Price price = getPriceInfo(productID);
        return price;
    }

    public Price getPriceInfo(Long productID) {
        populatePriceList();
        for (Price price : priceList) {
            if (productID.equals(price.getProductID())) {
                return price;
            }
        }
        return null;
    }

    private void populatePriceList() {
        priceList.add(new Price(101L, 101L, 999.25));
        priceList.add(new Price(102L, 102L, 36.10));
        priceList.add(new Price(102L, 103L, 2999.00));
        priceList.add(new Price(104L, 104L, 5000.00));
        priceList.add(new Price(105L, 105L, 350.40));
    }
}
