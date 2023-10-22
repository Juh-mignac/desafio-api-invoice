package me.dio.repository;

import org.springframework.data.repository.CrudRepository;

import me.dio.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{

}