package servletchaining;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PaymentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
			response.setContentType("text/html");
			
			out.print("<h1> Welcome to Payment Servlet </h1>");
			
			ServletContext application =		request.getServletContext();
			
				String productData = (String)		application.getAttribute("productData");
			
			
			Integer  amount = (Integer)		request.getAttribute("billAmount");
			
			
			HttpSession  session =		request.getSession();
			
			String username  = (String)		session.getAttribute("username");
			
			
			out.print("<h1>WELCOME "+username +" </h1>");
			
			out.print("<h1> Your product deatails "+productData +"</h1>");
		
			out.print("<h1>Your Total Bill Amount is: "+ amount  +" </h1>");
		
			
			
				
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
