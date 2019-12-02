<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h3>${msg}</h3>
<fieldset style="width:250px;align:center;">
<legend Style="color:red;border:3px solid green;">Login here</legend>
<form action="./login" method ="post">

<table >
<tr>
<td>ID:</td>
<td><input type="text" placeholder="enter email" name="email" required="required"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="password" placeholder="enter Password" required="required"></td>
</tr>
<tr>
<td ><button type="submit" Style="color:white;display:block;border:3px solid green;background-color:tomato;">login</button></td>

</tr>

</table>


</form>
</fieldset>
<a href="./register" >Click here to Register</a>


</body>
</html>