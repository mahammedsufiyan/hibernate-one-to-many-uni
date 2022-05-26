package com.ty.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile_Sim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Mobile mobile = new Mobile();
		mobile.setName("Monkey");
		mobile.setCost(5000); 
		
		Sim sim = new Sim();
		sim.setProvider("Ajio");
		sim.setType("5G");
		
		Sim sim2 = new Sim();
		sim2.setProvider("VI");
		sim2.setType("5G");
		
		Sim sim3 = new Sim();
		sim3.setProvider("Nonsence");
		sim3.setType("5G");
		
		List<Sim> sims = new ArrayList<Sim>();
		sims.add(sim);
		sims.add(sim2);
		sims.add(sim3);
		mobile.setSim(sims);

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		entityTransaction.commit();
				
				
	}
}
