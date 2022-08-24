<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Management</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous">
	</script>
<script type="text/javascript">
    function userValidation(form) {
    	var email = form.email.value;
        var password = form.password.value;
        var confirmPassword = form.confirmPassword.value;
        var name = form.fullName.value;

        if(email == "") {
        	form.email.focus();
        	return false;
            } 
        if(password == "") {
        	form.password.focus();
        	return false;
            } 
        if(confirmPassword == "") {
        	form.confirmPassword.focus();
        	return false;
            } 
        if(name == "") {
        	form.name.focus();
        	return false;
            } 
        
        return false;
    }
</script>
	<style type="text/css" >
		 body {
   
   
    background: linear-gradient(#000000bb, #000000bb), url(https://www.fastweb.com/uploads/article_photo/photo/2036603/crop635w_classof22.jpeg);
  

  }

		* {
			box-sizing: border-box;
		}
		/* Header/Blog Title */
		.bg-light {
			background-color: #8bc34a!important;
		}

		.container {
			margin-top: 10px;
			padding: 10px;
			background-color: #dcedc8!important;
		}

		.header h1 {
			font-size: 50px;
		}

		.btn-primary {
			color: #fff;
			background-color: #009688;
			border-color: #0d6efd;
		}

	</style>
</head>



<body>
	<!--  navbar   -->
	<nav class="navbar fixed-navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/home">Home</a>
					</li>

					<li class="nav-item"><a class="nav-link" href="/createUser">Create
							User</a></li>
					<li class="nav-item"><a class="nav-link" href="/login">Login</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- navbar end -->

	<!-- Create User Form-->
	<div class="container">
		<form  method="post" action="/createUser">
			<h1>Create Account</h1>

			<c:forEach var="error" items="${errors}">
				<span style='color: red'>${error}</span>
				<br>
			</c:forEach>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Full Name</label>
				<input type="text" class="form-control" name="fullName"
					   value="${form.fullName }">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					Address</label> <input type="email" name="email" value="${form.email }"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp">
				<c:forEach items="${errorFields}" var="errorField">
					<c:if test='${errorField.getField().equals("email") }'>
						<br>
						<span style='color: red'>${errorField.defaultMessage}</span>

					</c:if>
				</c:forEach>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" name="password" value="${form.password }"
					class="form-control" id="exampleInputPassword1">
				<c:forEach items="${errorFields}" var="errorField">
					<c:if test='${errorField.field == "password" }'>
						<br>
						<span style='color: red'>${errorField.defaultMessage}</span>
					</c:if>
				</c:forEach>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Confirm
					Password</label> <input type="password" name="confirmPassword"
					value="${form.confirmPassword }" class="form-control"
					id="exampleInputPassword1">
				<c:forEach items="${errorFields}" var="errorField">
					<c:if test='${errorField.field == "confirmPassword" }'>
						<br>
						<span style='color: red'>${errorField.defaultMessage}</span>
					</c:if>
				</c:forEach>
			</div>


			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Select Role</label>
				<select  class="form-label" name="role">
					<option value="Student" >Student</option>
					<option value="Volunteer" >Volunteer</option>
				</select>

			</div>

			<button type="submit" value="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>