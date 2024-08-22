package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import beans.Employee;
import dao.JPAUtil;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayController
 */
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DisplayController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();
		
		EntityManager em =	JPAUtil.getEntityManager();
			
			
			System.out.println("Display Controller executed...");
			
			
		TypedQuery<Employee>  query =	em.createQuery("select e from Employee  e ",Employee.class);
			
			List<Employee>  list =		query.getResultList();
			
			
			  HttpSession session = request.getSession();
			  
			  session.setAttribute("list", list);
			 
		

				RequestDispatcher    rd = request.getRequestDispatcher("/views/display.jsp");

					rd.include(request, response);
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
