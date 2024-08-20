<%@ page language="java"  import = "java.time.*"   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>WELCOME TO HTML</h1>
	 Hi Friends!
	 
	 
	 <% 
	 
	 	int x = 99;
	 
	 	out.print("<br>");
	 
	 	out.print(x );
	 
	 LocalDateTime  dt =	LocalDateTime.now();
	 
		out.print("<br>");
	 	out.print("Date "+dt);
	 	
	 	
	 
	 %>
	 
	


</body>
</html>