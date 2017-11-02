<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer list</title>
</head>
<body>
<h3>Welcome to Customer Report</h3>
<input type = "submit" value="Add Customer"
 onclick = "window.location.href='${pageContext.request.contextPath}/customer/showFormForAdd';return false;"/>
<br/><br/>
<table border = "1px">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Operation</th>
	</tr>

	<c:forEach var = "tempCustomer" items = "${customer_list}">
		<c:url var = "updateLink" value="/customer/updateForm">
			<c:param name="customerId" value="${tempCustomer.id}"/>
		</c:url>
		<c:url var = "deleteLink" value="/customer/deleteForm">
			<c:param name="customerId" value="${tempCustomer.id}"/>
		</c:url>
		<tr>
			<td>${tempCustomer.firstName}</td>
			<td>${tempCustomer.lastName}</td>
			<td>${tempCustomer.email}</td>
			<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}" onclick="return confirm('Are you sure you want to Remove?');" >Delete</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>