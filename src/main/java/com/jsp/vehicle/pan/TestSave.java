package com.jsp.vehicle.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("osama");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	    
	    Vehicle vehicle = new Vehicle();
	    vehicle.setName("5 series");
	    vehicle.setBrand("BMW");
	    vehicle.setColor("Black");
	    vehicle.setPrice(1000000);
	    
	    
	    Chasis chasis= new Chasis();
	    chasis.setChasis_no("bmw@1234");
	    chasis.setVehicle(vehicle);
	    vehicle.setChasis(chasis);
	    
	    
	    
	    
	    
	    entityTransaction.begin();
	    entityManager.persist(vehicle);
	    entityManager.persist(chasis);
	    entityTransaction.commit();
	    
	}

}
