package com.oracle.oneToone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Address homeAddress = new Address();
		homeAddress.setStreet("James Street");
		homeAddress.setCity("Mumbai");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411 019");
		
		Student student = new Student();
		student.setStudentId(102);
		student.setName("tom");
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		//em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		
		Address address = 	em.find(Address.class, 1);
		
			System.out.println(address);
		
		
		em.close();
		factory.close();
	}
}
