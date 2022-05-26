package com.ty.one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDetails_Mobile_Sim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Mobile mobile = entityManager.find(Mobile.class, 1);
		if(mobile != null) {
			
		List<Sim> sims = mobile.getSim();
		
		System.out.println("------------------");
		System.out.println("Mobile name is "+mobile.getName());
		System.out.println("Mobile cost is "+mobile.getCost());
		System.out.println("-------------------");
		for(Sim sim : sims) {
			System.out.println("Sim id "+sim.getId());
			System.out.println("Sim Proveder "+sim.getProvider());
			System.out.println("Sim type  "+sim.getType());
			System.out.println("**********");
			}
		}
		else 
			System.out.println("Mobile not exist");
	}
}
