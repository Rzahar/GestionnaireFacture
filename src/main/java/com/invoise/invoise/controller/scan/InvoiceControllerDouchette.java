package com.invoise.invoise.controller.scan;

import com.invoise.invoise.controller.InvoiceControllerInterface;
import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    @Override
    public String createInvoice(Invoice invoice) {
        System.out.println("Usage du scanner");
        invoice=new Invoice();
        invoice.setCustomerName("Virgin");
        invoiceServiceInterface.createInvoice(invoice);
        return null;
    }
}
