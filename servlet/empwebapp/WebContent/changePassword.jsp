<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<a href="./home">Home</a>
<a style ="float:right" href="./logout" >Logout</a>
<h4> <%= msg %></h4>
<fieldset>
<legend>Change Password</legend>

<form action="./changePassword" method ="post">
<table align="center">
  <tr>
      <td>New Password</td>
      <td><input  name = "password" type = "password" ></td>
  </tr>
  
  <tr>
      <td>Confirm Password</td>
      <td><input  name = "confirmPassword" type = "password" ></td>
  </tr>

 <tr>
     <td><input  type = "submit" value = "changePassword" ></td>
      <td><input  type = "reset" value = "reset" ></td>
     
  </tr>

</table>

</form>
</fieldset>


</body>
</html>