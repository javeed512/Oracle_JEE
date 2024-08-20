<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is Two.JSP</h1>

<%

	int x = 99;

	Integer amountValue = (Integer)	session.getAttribute("amount");

		out.print("Amount using scriplet "+amountValue);
%>

<br>

Amount using JSP Exp:  <%= session.getAttribute("amount")  %>  <br>

<br>
EL Expression:  ${ amount }



</body>
</html>