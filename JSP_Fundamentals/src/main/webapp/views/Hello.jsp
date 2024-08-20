<%@ page language="java"  import = "java.time.* , java.util.*"   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- JSP Template -->
	
	<h1>WELCOME TO HTML</h1>
	 Hi Friends!
	 
	 
	 <%-- JSP Scriplet   --%>
	 
	 <% 
	 
	 	int x = 99;
	 
	 	out.print("<br>");
	 
	 	out.print(x );
	 
	 LocalDateTime  dt =	LocalDateTime.now();
	 
		out.print("<br>");
	 	out.print("Date "+dt);
	 	
	 	
			int num = 9/0;   // new Arithmetic();
	 
	 %>
	 
	 
	 <%-- jsp expression   --%>
	 
	 <%= new String("Javeed")  %>
	 
	 <%= x %>
	 
	 <%--  JSP Declaration --%>
	
	<%!
	
		int eid;
	    String ename;
	    
	    static String city;
	
	    
 	public void show(){
	 		
	 		
	 	}
	 	
	    
	
	%>
	
	
	
	
	
	
	

</body>
</html>