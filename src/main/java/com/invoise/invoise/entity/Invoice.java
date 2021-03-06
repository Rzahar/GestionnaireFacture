package com.invoise.invoise.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class Invoice {

    @Id
    @Column("INVOICE_NUMBER")
    private String number;
    @Column("CUSTOMER_NAME")
    private String customerName;
    @Column("ORDER_NUMBER")
    private String orderNumber;

    public Invoice() {
    }

    public Invoice(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoice(String number, String customerName, String orderNumber) {
        this.number = number;
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }



    public String getOrderNumber() { return orderNumber;}

    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
