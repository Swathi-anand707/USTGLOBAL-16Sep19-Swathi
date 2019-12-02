<%@page import="com.ustglobal.productapp.beans.Retailer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Retailer bean = (Retailer) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changePassword">Change Password</a>

	
	<a href="./logout" style="float: right">logout</a>
	<h2>
		Welcome
		<%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">

			<tr>
				<td><input type="number" name="pid"></td>
				<td><input type="submit" value="Search"></td>
			</tr>



		</form>


	</fieldset>

	<%
		Retailer retailBean = (Retailer) request.getAttribute("bean");
	%>
	<%
		if (retailBean != null) {
	%>
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			
		</tr>


		<tr>
			<td><%=retailBean.getName()%></td>
			<td><%=retailBean.getEmail()%></td>

		</tr>

	</table>

	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>

