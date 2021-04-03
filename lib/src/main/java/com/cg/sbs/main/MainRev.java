package com.cg.sbs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.cg.sbs.entity.Review;

public class MainRev {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
        EntityManager entityManager = factory.createEntityManager();
        
        
//        //saving product
        Review product = new Review();
        product.setUserId("usr110");
        product.setReview("Nice");
        
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(product);
        System.out.println("Product saved");
        txn.commit();
    }
}