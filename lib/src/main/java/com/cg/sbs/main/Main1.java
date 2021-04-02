package com.cg.sbs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.sbs.entity.Customer;
import com.cg.sbs.entity.Products;

public class Main1 {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
        EntityManager entityManager = factory.createEntityManager();
        
        
//        //saving product
        Customer product = new Customer();
        product.setUserId("usr110");
        product.setName("MS");
        product.setContactno("123456789");
        product.setEmail("ms@abc.com");
        
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(product);
        System.out.println("Product saved");
        txn.commit();
    }
}