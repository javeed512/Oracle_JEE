<%@ page   isELIgnored="false"   import="beans.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>EMPLOYEE DETAILS ADDED TO EMP_DB TABLE</h1>

<% 

	Employee emp1  = (Employee) session.getAttribute("emp");
	
		out.print(emp1.getEid()  +" "+ emp1.getEname() +" "+emp1.getSalary() );
		

%>

<%-- <br>
Display emp using JSP Exp:
<%=   session.getAttribute("emp") %>

<br>


Display emp using EL-Exp :
${ emp }


<BR>

Emp Details using Jsp getProperty Action Tag: <br>

<jsp:useBean  id="emp"  class="beans.Employee"  scope="session"></jsp:useBean>
<jsp:getProperty property="eid" name="emp"/>
<jsp:getProperty property="ename" name="emp"/>
<jsp:getProperty property="salary" name="emp"/>

<br>
 --%>



</body>
</html>