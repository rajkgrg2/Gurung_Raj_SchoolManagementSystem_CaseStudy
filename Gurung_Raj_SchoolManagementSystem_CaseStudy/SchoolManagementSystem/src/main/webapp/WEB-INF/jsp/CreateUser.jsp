<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="home.css">
<link rel="stylesheet" href="home.css">

<!-- <link href="/ccs/style.css" rel="stylesheet" type="text/css"> -->


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>

 <style type="text/css">
/* Header/Blog Title */
.header {
	padding: 30px;
	text-align: center;
	background: white;
	
}




.header h1 {
	font-size: 50px;
}
 

.navbar {
	background-color: #E27C6E;
    
  
  
}
</style>
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
	<link rel="stylesheet" href="style.css">

	<link href="/ccs/style.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div class="header">
		<h1>School Management System</h1>
	
	</div>


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

					<li class="nav-item"><a class="nav-link" href="/createUser">Create
							User</a></li>

					<li class="nav-item"><a class="nav-link" href="/login">Login</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	
	
</body>
</html> 

