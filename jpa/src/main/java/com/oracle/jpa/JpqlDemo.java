package com.oracle.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.oracle.jpa.entity.Employee;

public class JpqlDemo {
	
 static	EntityManager  em =	JPAUtil.getEntityManager();

	public static void main(String[] args) {


			
		
			
			//JPQL 
			
		TypedQuery<Employee>  query	=	em.createQuery("select e from  Employee  e where e.ename = 'javeed'",Employee.class);
		
				
			Employee emp =		query.getSingleResult();
			
					System.out.println(emp.getEid());
					System.out.println(emp);
					
					
						TypedQuery<Employee>  queryAll =			em.createQuery("select e  from Employee e",Employee.class);
						
						System.out.println("criteria query");
						
						List<Employee>	list =	queryAll.getResultList();
						
						list.forEach( (e1)->{ System.out.println(e1.getEname());}  );
						
						em.getTransaction().begin();
						
					Query query2 = 			em.createQuery("delete from Employee e  where e.eid = 106");
				
						int count =	query2.executeUpdate();
						
						System.out.println(count + " record deleted... ");
						
						em.getTransaction().commit();
						
						System.out.println("Named Query");
						
						
						getAllEmployees().forEach( (emp1) ->{ System.out.println(emp1);});
						
		
	}
	
	
	
	
	  public static  List<Employee>   getAllEmployees(){
		 
		  
		   TypedQuery<Employee>  query  =  em.createNamedQuery("getAllEmployees", Employee.class);
		  			
		   					List<Employee>  list =		query.getResultList();
		  
		  return list;
		  
	  }
	
	
	
	

}
