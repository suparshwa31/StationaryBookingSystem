package com.cg.sbs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.cg.sbs.entity.Address;
public class MainAddr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
        EntityManager entityManager = factory.createEntityManager();
        
		Address product=new Address("D20","","","Noida","UP","201301");
		product.setOrderId("odr100");
		EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(product);
        System.out.println("Product saved");
        txn.commit();
	}

}
