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
		homeAddress.setStreet("MG Road");
		homeAddress.setCity("Pune");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411 017");
		
		Student student = new Student();
		student.setStudentId(101);
		student.setName("Deepak Patil");
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}
}
