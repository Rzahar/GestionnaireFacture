package com.invoise.invoise.controller.web.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InvoiceForm {

    private String number;
    @NotBlank(message = "Le nom du client est obligatoire")
    private String customerName;
    @Size(min = 5, max = 13, message = "Le numero de commande doit être compris entre 5 et 13")
    private String orderNumber;

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

