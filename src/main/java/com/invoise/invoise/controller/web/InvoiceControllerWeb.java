package com.invoise.invoise.controller.web;

import com.invoise.invoise.controller.InvoiceControllerInterface;
import com.invoise.invoise.controller.web.form.InvoiceForm;
import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceControllerWeb {

    @Autowired
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    @PostMapping("/create")
    public String createInvoice(@Valid @ModelAttribute InvoiceForm invoiceForm, BindingResult results){
        if (results.hasErrors()) {
            return "create-form";
        }
        Invoice invoice = new Invoice();
        invoice.setCustomerName(invoiceForm.getCustomerName());
        invoice.setOrderNumber(invoiceForm.getOrderNumber());
        invoiceServiceInterface.createInvoice(invoice);
        return "invoice-created";
    }

    @GetMapping("/home")
    public String displayHome(Model model) {
        System.out.println("Methode home");
        model.addAttribute("invoices",invoiceServiceInterface.getInvoiceList());
        return "invoice-home";
    }

    /*@GetMapping("/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model) {
        System.out.println("Methode DisplayHome a été appelée");
       model.addAttribute("invoice",invoiceServiceInterface.getInvoiceByNumber(number));
        return "invoice-details";
    } */

    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute InvoiceForm invoice){
        return "create-form";

    }

}
