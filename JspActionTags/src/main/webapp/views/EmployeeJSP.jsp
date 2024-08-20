<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee JSP use as a Controller</h1>
</body>
</html>

<jsp:useBean id="emp" class="beans.Employee"  scope="session"></jsp:useBean>
 
<jsp:setProperty property="eid" name="emp"   param="eid"/>
<jsp:setProperty property="ename" name="emp"   param="ename"/>
<jsp:setProperty property="salary" name="emp"   param="salary"/>


<jsp:include page="/views/success.jsp"></jsp:include>