package com.invoise.invoise.service.number;

import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.repository.InvoiceRepositoryInterface;
import com.invoise.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Override
    public Iterable<Invoice>getInvoiceList(){
        return invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> getInvoiceByNumber(String number){
        return Optional.of(invoiceRepository.findById(number).orElseThrow());
    }

    public InvoiceRepositoryInterface getInvoiceRepository(){
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
}
