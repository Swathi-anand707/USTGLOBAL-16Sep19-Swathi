<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset style="width:250px;align:center;">
<legend Style="color:red;border:3px solid green;">Register here</legend>
<form action="./register" method ="post">
<table>
<tr>
<td>Name: </td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Email: </td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Password: </td>
<td><input type="password" name="password"></td>
</tr>

<tr>

<td ><button type="submit" Style="color:white;display:block;border:3px solid green;background-color:tomato;">Register</button></td>
<td><button type="reset" Style="color:white;display:block;border:3px solid green;background-color:tomato;">Reset</button></td>
</tr>

</tr>


<tr>


</table>
</form>
</fieldset>
<a href="./login">Click here to login</a>

</body>
</html>