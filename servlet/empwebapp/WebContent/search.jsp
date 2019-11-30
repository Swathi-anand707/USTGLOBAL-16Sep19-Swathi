
<%@ page import = "com.ustglobal.empwebapp.dto.Employee_info" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
  <% 
  Employee_info info = (Employee_info) request.getAttribute("info");
 
  
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href='./home'>Home</a>
<a style='float:right' href='./logout'>Logout</a>
<% if(info!=null) {%>
<fieldset>
<legend>Employee info</legend>
<table align="center">

<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
</tr>
<tr>
<td><%=info.getId() %></td>
<td><%=info.getName() %></td>
<td><%=info.getEmail() %></td>

</tr>




</table>
</fieldset>
<% }else{ %>
<h1>no data found</h1>
<%} %>
</body>
</html>