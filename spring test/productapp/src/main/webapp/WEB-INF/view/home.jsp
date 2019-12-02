<%@page import="com.ustglobal.productapp.beans.Retailer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
   Retailer bean =(Retailer)session.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="./changepassword" style="color:green">Change Password</a>
	<a href="./order" style="color:blue">ordered item</a>
	<a href="./search" style="color:green">Search Product</a>
	<a href="./logout" style="color:blue">Logout</a>
	<h1 style="color: green;">Welcome <%= bean.getName() %>   </h1>

<h4 style="color: red;">${msg}</h4>

</body>
</html>