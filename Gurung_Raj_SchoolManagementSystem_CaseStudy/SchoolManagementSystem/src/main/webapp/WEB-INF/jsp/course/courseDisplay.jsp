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
	<!-- navbar -->
	<div class="container">
	<h1> All Courses </h1>

		<form action="/courseDisp" method="get">

			Search <input type="text" name="search" class="form-control" >
			<br>
			<input type="submit"
															value="Submit" class="btn btn-primary" />
		</form>
		<br>

		<c:choose>
			<c:when test="${empty courses }">
				<h1>No results found.</h1>
			</c:when>
			<c:otherwise>
				<table border="1" cellpadding="3">
					<tr>
						<td><b>ID</b></td>
						<td><b>Course name</b></td>
						<td><b>Semester Offered</b></td>
						<td><b>Action</b></td>
					</tr>

					<c:forEach items="${courses}" var="courses">
						<tr>
							<td>${courses.id }</td>
							<td>${courses.courseName }</td>
							<td>${courses.semesterOffered }</td>
							<td><a href="/deleteCourse?id=${courses.id }">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>

	</div>
</div>
</body>

</html>