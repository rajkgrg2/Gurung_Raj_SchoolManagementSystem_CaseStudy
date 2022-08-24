<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
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
<!--  navbar   -->
<body>
<nav class="navbar fixed-navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">School Management</a>
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

				<li class="nav-item"><a class="nav-link" href="/student">Student</a></li>
				<li class="nav-item"><a class="nav-link" href="/volunteer">Volunteer</a></li>
				<li class="nav-item"><a class="nav-link" href="/course">Course</a></li>
				<li class="nav-item"><a class="nav-link" href="/courseDisplay">All Courses</a></li>
				<li class="nav-item"><a class="nav-link" href="/courseEdit">Edit course</a></li>
				<li class="nav-item"><a class="nav-link" href="/class">Add class</a></li>
				<li class="nav-item"><a class="nav-link" href="/classDisplay">all class</a></li>
				<li class="nav-item"><a class="nav-link" href="/logout">Logout</a>
			</ul>
		</div>
	</div>
</nav>
	<div class="container">
	<!-- navbar -->
	<form method="post" action="/class"
		enctype="multipart/form-data">
	
		<h1>Add Class</h1>
		<c:forEach var="error" items="${errors}">
			<span style='color: red'>${error}</span>
			<br>
		</c:forEach>
			<div class="mb-3">
				<label for="formGroupExampleInput1" class="form-label">
					Class Name </label> <input type="text" class="form-control"
					id="fexampleFormControlInput1" name="class_name"
					value="${form.class_name }" />
				<c:forEach items="${errorFields}" var="errorField">
					<c:if test='${errorField.getField().equals("class_name") }'>
						<br>
						<span style='color: red'>${errorField.defaultMessage}</span>

					</c:if>
				</c:forEach>
			</div>

			<div class="mb-3">
				<label for="formGroupExampleInput1" class="form-label">
					Description </label> <input type="text" class="form-control"
					id="fexampleFormControlInput1" name="description"
					value="${form.description }"  />
				<c:forEach items="${errorFields}" var="errorField">
					<c:if test='${errorField.getField().equals("description") }'>
						<br>
						<span style='color: red'>${errorField.defaultMessage}</span>

					</c:if>
				</c:forEach>
			</div>

			<div>
				<button type="submit" value="submit" class="btn btn-primary">Add</button>
			</div>

		

	
	</form>

</div>
</body>
</html>