package com.invoise.invoise.repository.memory;

import com.invoise.invoise.entity.Invoice;
import com.invoise.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public Invoice save(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("La facture database en mémoire avec le numéro " + invoice.getNumber() + " a bien été ajoutée et associée au client " + invoice.getCustomerName());
        return invoice;
    }

    @Override
    public Iterable<Invoice> findAll(){
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Invoice> findAllById(Iterable<String> iterable) {
        return null;
    }


    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Invoice entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Invoice> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Invoice> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Invoice> findById(String number){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(String s) {
        throw new UnsupportedOperationException();
    }


}
