package com.cg.sbs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.sbs.entity.Track;
public class MainTrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
        EntityManager entityManager = factory.createEntityManager();
        
        
//        //saving
        Track product = new Track();
        product.setOrderId("odr100");
        product.setOrderStatus("In Transit");
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(product);
        System.out.println("Product saved");
        txn.commit();
	}

}
