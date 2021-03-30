<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Add Contact</title>
	<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
	<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<spring:url value="/contact/addContact" var="addURL" />
		<h2>Add Contact</h2>
		<form:form modelAttribute="contactForm" method="post" action="${addURL}" cssClass="form" >
			<form:hidden path="customer_id"/>
			<div class="form-group">
				<label>First Name</label>
				<form:input path="firstname" cssClass="form-control" id="firstname" />
			</div>
			<div class="form-group">
				<label>Last Name</label>
				<form:input path="lastname" cssClass="form-control" id="lastname" />
			</div>
			<div class="form-group">
				<label>Email</label>
				<form:input path="email" cssClass="form-control" id="email" />
			</div>
			<div class="form-group">
				<label>City</label>
				<form:input path="city" cssClass="form-control" id="city" />
			</div>
			<div class="form-group">
				<label>Country</label>
				<form:input path="country" cssClass="form-control" id="country" />
			</div>
			<div class="form-group">
				<label>Telephone</label>
				<form:input path="telephone" cssClass="form-control" id="telephone" />
			</div>
			<div class="form-group">
				<label>Address</label>
				<form:input path="address" cssClass="form-control" id="address" />
			</div>
			<button type="submit" class="btn btn-success">Add Contact</button>
		</form:form>
	</div>
</body>
</html>