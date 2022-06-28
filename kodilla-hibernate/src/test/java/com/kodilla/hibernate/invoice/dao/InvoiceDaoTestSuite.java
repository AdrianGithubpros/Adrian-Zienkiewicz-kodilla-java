package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

//
//    @Test
//    void testInvoiceDaoSave(){
//        //Given
//        Product product1 = new Product("Product 1");
//        Product product2 = new Product("Product 2");
//        Item item1 = new Item(new BigDecimal(85676), 1, new BigDecimal(1100));
//        Item item2 = new Item(new BigDecimal(22220), 1, new BigDecimal(1800));
//        Item item3 = new Item(new BigDecimal(65432), 3, new BigDecimal(2000));
//        Invoice invoice = new Invoice("53468");
//
//        item1.setProduct(product1);
//        item2.setProduct(product2);
//        item3.setProduct(product1);
//
//        item1.setInvoice(invoice);
//        item2.setInvoice(invoice);
//        item3.setInvoice(invoice);
//
//        product1.getItems().add(item1);
//        product1.getItems().add(item3);
//        product2.getItems().add(item2);
//
//        invoice.getItems().add(item1);
//        invoice.getItems().add(item2);
//        invoice.getItems().add(item3);
//
//        //When
//        invoiceDao.save(invoice);
//        int id = invoice.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.deleteById(id);
//    }
//
//
//
//


}

