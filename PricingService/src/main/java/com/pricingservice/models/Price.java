/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pricingservice.models;

/**
 *
 * @author AKulkarni17
 */
public class Price {

    private Long priceID;
    private Long productID;
    private Double listPrice;

    public Long getPriceID() {
        return priceID;
    }

    public void setPriceID(Long priceID) {
        this.priceID = priceID;
    }

    public Long getProductID() {
        return productID;
    }

    public Price(Long priceID, Long productID, Double listPrice) {
        this.priceID = priceID;
        this.productID = productID;
        this.listPrice = listPrice;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }
}
