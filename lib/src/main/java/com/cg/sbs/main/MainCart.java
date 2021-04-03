package com.cg.sbs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.sbs.entity.Cart;
public class MainCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
        EntityManager entityManager = factory.createEntityManager();
        
        
//        //saving
        Cart product = new Cart();
        product.setOrderId("odr100");
        product.setProductName("NoteBook");
        product.setQuantity(1);
        product.setProductId(110);
        product.setTotalAmount(70.0);
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(product);
        System.out.println("Product saved");
        txn.commit();
	}

}
