package com.oracle.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		/*
		 * em.getTransaction().begin();
		 * 
		 * Product product = new Product();
		 * 
		 * product.setPid(20); product.setPname("mobile");
		 * 
		 * 
		 * em.persist(product);
		 * 
		 * 
		 * 
		 * em.getTransaction().commit();
		 */
		 
			
			
			  em.getTransaction().begin();
			  
			  Product prod1 = em.find(Product.class, 10);
			  
			  System.out.println(prod1);
			  
 Product prod2 = em.find(Product.class, 20);
			  
			  System.out.println(prod2);
			  
 Product prod3 = em.find(Product.class, 30);
			  
			  System.out.println(prod3);
			  
			  	em.remove(prod3);
			  
			  em.getTransaction().commit();
			  
			 
			  
			
			 
        
    }
}
