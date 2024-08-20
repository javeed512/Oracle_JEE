package servletchaining;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter  out =	response.getWriter();
			
					response.setContentType("text/html");
			
				out.print("<h1>Customer Servlet</h1>");
				
				// using request scope
				
					request.setAttribute("billAmount", 90000);
					
						
			ServletContext application =		request.getServletContext();
				
						application.setAttribute("productData", "Dell Laptop price Rs.90000");
						
						

						HttpSession session =	request.getSession();
						
									session.setAttribute("username", "javeed");
						
						
					
						
						  RequestDispatcher rd = request.getRequestDispatcher("/PaymentServlet");
						  
						  //rd.include(request, response);
						  
						  rd.forward(request, response);
						 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
