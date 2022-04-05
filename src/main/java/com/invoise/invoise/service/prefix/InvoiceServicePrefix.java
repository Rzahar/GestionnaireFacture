package com.invoise.invoise.service.prefix;

import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.repository.InvoiceRepositoryInterface;
import com.invoise.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;

//@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Value("${invoice.lastNumber}")
    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public Invoice createInvoice(Invoice invoice){
        invoice.setNumber(prefix + ++lastNumber);
        invoiceRepository.save(invoice);
        return invoice;
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return (List<Invoice>) invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> getInvoiceByNumber(String number) {
        return Optional.of(invoiceRepository.findById(number).orElseThrow());
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }



    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }




}
