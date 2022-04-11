/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservices.models;

/**
 *
 * @author AKulkarni17
 */
public class ProductInfo {

    private Long productID;
    private String productName;
    private String productDescription;

    public ProductInfo(Long productID, String productName, String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
