package com.invoise.invoise.controller.keyboard;

import com.invoise.invoise.controller.InvoiceControllerInterface;
import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


//@Component
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public String createInvoice(Invoice invoice){
        // Scanner sc = new Scanner(System.in);
        // On retire la variable dans customerName et on la remplace par "Toto" pour gagner du temps
        // TODO a corriger dans la version finale
        String customerName = "Toto Console Mode";
        invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceInterface.createInvoice(invoice);
        return null;
    }

}
