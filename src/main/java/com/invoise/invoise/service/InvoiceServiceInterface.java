package com.invoise.invoise.service;

import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.repository.InvoiceRepositoryInterface;

import java.util.Optional;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    Iterable<Invoice>  getInvoiceList();
    Optional<Invoice> getInvoiceByNumber(String number);
}
