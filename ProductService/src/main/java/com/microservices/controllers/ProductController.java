/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.controllers;

import com.microservices.models.Product;
import com.microservices.models.ProductInfo;
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
public class ProductController {

    List<ProductInfo> productList = new ArrayList<>();

    @GetMapping("/product/details/{productID}")
    public Product getProductDetails(@PathVariable Long productID) {
        ProductInfo productInfo = getProductInfo(productID);
        return new Product(productInfo.getProductID(), productInfo.getProductName(), productInfo.getProductDescription(), 999.25, true);
    }

    public ProductInfo getProductInfo(Long productID) {
        populateProductList();
        for (ProductInfo pInfo : productList) {
            if (productID.equals(pInfo.getProductID())) {
                return pInfo;
            }
        }
        return null;
    }

    private void populateProductList() {
        productList.add(new ProductInfo(100L, "iPhone", "iPhone 13 pro max"));
        productList.add(new ProductInfo(101L, "Book", "Data Structures and Algorithms"));
        productList.add(new ProductInfo(102L, "MacBook", "Fastest Laptop"));
        productList.add(new ProductInfo(103L, "Washing Machine", "Washing Machine is essential"));
        productList.add(new ProductInfo(104L, "Shoes", "Air Jordan 1 Sneakers"));
    }
}
