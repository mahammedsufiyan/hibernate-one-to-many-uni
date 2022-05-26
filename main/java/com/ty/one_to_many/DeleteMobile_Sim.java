package com.ty.one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMobile_Sim {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class, 2);
		if(mobile != null) {
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
		}
	}
}
