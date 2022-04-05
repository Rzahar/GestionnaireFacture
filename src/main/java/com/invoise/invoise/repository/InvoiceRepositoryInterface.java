package com.invoise.invoise.repository;

import com.invoise.invoise.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
    /*Invoice create(Invoice invoice);

    InvoiceRepositoryInterface list();
     Invoice create(Invoice invoice);
     List<Invoice>list();

    Invoice getById(String number); */
}
