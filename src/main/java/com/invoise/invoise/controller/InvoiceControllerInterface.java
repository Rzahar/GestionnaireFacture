package com.invoise.invoise.controller;

import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.service.InvoiceServiceInterface;

import java.util.List;

public interface InvoiceControllerInterface {

    String createInvoice(Invoice invoice);
    void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface);

}
