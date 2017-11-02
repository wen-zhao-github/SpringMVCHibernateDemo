<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Customer</title>
</head>
<body>
<p>Add New Customer</p>
	<form:form action="processAddForm" modelAttribute="new_customer">
        <label>First Name: </label><form:input path="firstName" />
		<br /><br />
        <label>Last Name: </label><form:input path="lastName" />
		<br /><br />
		<label>Email: </label><form:input path="email"/>
		<br/><br/>
		<input type="submit" value = "Save" />
	</form:form>
	<br/><br/>
	<a href = "${pageContext.request.contextPath}/customer/list">Back to List</a>
</body>
</html>