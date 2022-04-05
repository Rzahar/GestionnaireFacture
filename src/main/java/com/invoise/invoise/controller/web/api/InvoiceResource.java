package com.invoise.invoise.controller.web.api;

import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/invoice")
public class InvoiceResource {


        @Autowired
        private InvoiceServiceInterface invoiceServiceInterface;

        public InvoiceServiceInterface getInvoiceServiceInterface() {
            return invoiceServiceInterface;
        }

        public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
            this.invoiceServiceInterface = invoiceServiceInterface;
        }

       @PostMapping
        public Invoice create(@RequestBody Invoice invoice){
            return invoiceServiceInterface.createInvoice(invoice);
        }

        @GetMapping()
        public List<Invoice> list(){
            System.out.println("Methode display List invoquée");
            return (List<Invoice>) invoiceServiceInterface.getInvoiceList();
        }

        @GetMapping("/{id}")
        public Optional<Invoice> get(@PathVariable("id") String number) {
            System.out.println("Methode DisplayHome a été appelée");
            return invoiceServiceInterface.getInvoiceByNumber(number);
        }

       /* @GetMapping("/create-form")
        public String displayInvoiceCreateForm(@ModelAttribute InvoiceForm invoice){
            return "create-form";

        } */

    }

