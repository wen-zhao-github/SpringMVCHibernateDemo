<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
<form:form action="/customer/saveUpdates" modelAttribute="currentCustomer">
	<form:hidden path = "id"/>
	
		<label>First Name: </label><form:input path="firstName"/> <br/><br/>
		<label>Last Name: </label><form:input path="lastName"/><br/><br/>
		<label>Email</label><form:input path="email"/><br/><br/>
		<input type="submit" value="Save"/>
	

</form:form>

</body>
</html>