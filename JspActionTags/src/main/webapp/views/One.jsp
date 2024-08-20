<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>WELCOME ONE.JSP </h1>
	
	<%
	
		int  amount = 50000;
	
		session.setAttribute("amount",amount);
		
	
			
	
	%>
	
<%-- 	<jsp:include page="/views/Two.jsp"></jsp:include> --%>

	<jsp:forward page="/views/Two.jsp"></jsp:forward>


</body>
</html>