package controller;

import java.io.IOException;
import java.io.PrintWriter;

import beans.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				PrintWriter out = response.getWriter();
				
				
				System.out.println("Employee Controller executed...");
				
			String id =		request.getParameter("eid");
					
			String ename =		request.getParameter("ename");
					
			String sal =		request.getParameter("salary");
					
				
					int eid =	Integer.parseInt(id);
					double salary =  Double.parseDouble(sal);
					
					
					Employee emp = new Employee();
					
						emp.setEid(eid);
						emp.setEname(ename);
						emp.setSalary(salary);
						
						
							HttpSession session =	request.getSession();
							
								session.setAttribute("emp", emp);
					
			
							RequestDispatcher    rd = request.getRequestDispatcher("/views/success.jsp");
	
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
