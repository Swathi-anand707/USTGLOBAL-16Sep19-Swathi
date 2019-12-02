<%@page import="com.ustglobal.productapp.beans.Retailer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Retailer user=(Retailer)session.getAttribute("user"); %>
<fieldset style="width:250px;align:center;">
<legend Style="color:red;border:3px solid green;">Update Password</legend>

<form action="./changepassword" method="post" style="margin-left: 450px;margin-top: 100px;">
ID:
<br><input type="text" name="id" value="<%=user.getId()%>"><br>
Password:<br>
<input type="text" name="password">
<button type="submit" Style="color:white;display:block;border:3px solid blue;background-color:pink;">change</button>
</form>
</fieldset>
</body>
</html>