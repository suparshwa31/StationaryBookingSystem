package com.cg.sbs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.sbs.entity.Address;
import com.cg.sbs.entity.Customer;

public class MainCust {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
        EntityManager entityManager = factory.createEntityManager();
        
        
        //saving
        Address a=new Address("D20","","","Noida","UP","201301");
        Customer product = new Customer();
        product.setUserId("usr110");
        product.setName("MS");
        product.setContactno("123456789");
        product.setEmail("ms@abc.com");
        product.setAddress(a.toString());
        product.setDob("10/04/2000");
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(product);
        System.out.println("Product saved");
        txn.commit();
    }
}