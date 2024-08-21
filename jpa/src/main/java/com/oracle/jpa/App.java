package com.oracle.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.oracle.jpa.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	
    EntityManagerFactory  emfactory =		Persistence.createEntityManagerFactory("JPA-PU");
    		
    		EntityManager  em =	emfactory.createEntityManager();
    		
    					
    			Employee  emp  = new Employee();
    			
				/*
				 * emp.setEid(103); emp.setEname("smith"); emp.setSalary(30000);
				 */
    					
    			EntityTransaction  transaction =		em.getTransaction();
    					
    					transaction.begin();
    					
    					//DML Operation INSER,UPDATE,DELETE
    					
    					// insert into Emp_Info (emp_name, salary, emp_id) values (?, ?, ?)
    					
    					//em.persist(emp);   // inserting emp record in Employee table
    					
    					
    				Employee employee =		em.find(Employee.class, 101);  // select * from emp_info where emp_id = ?;
    					
    						System.out.println(employee);
    						
    						// update emp_info  set emp_name = ? , salary = ? where emp_id = ?;
    						
							/*  // update for employee 101
							 * employee.setEname("javeed khan"); employee.setSalary(99000);
							 * 
							 * em.persist(employee); // emp updated...
							 */    						
    						//	em.remove(employee);  //delete from Emp_Info where emp_id=?

    							
    							Employee employee2 =		em.find(Employee.class, 102); 
    							
    						
    									employee2.setEname("tom cruze");
    									employee2.setSalary(45000);
    							
    						
    					transaction.commit();
    					
    					
    					
    		
    		
    	
    	
    }
}
