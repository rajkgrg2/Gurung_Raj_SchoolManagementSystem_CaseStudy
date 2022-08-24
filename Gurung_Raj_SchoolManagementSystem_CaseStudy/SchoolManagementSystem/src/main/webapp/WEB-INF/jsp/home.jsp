
  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	 <!-- <link href="../resources/static/css/style.css" rel="stylesheet" type="text/css">  -->
	 <link href="<c:url value="../resources/static/css/style.css" />" rel="stylesheet"> 
	
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>The Modern College - USA</title>
	
	

</head>
<body>

<nav class="navlist">
	<ul>
		<li><h4>PS.</h4></li>
		<li><a href="/createUser">Create User</a></li>
		<li><a href="/login">Login</a></li>

	</ul>
</nav>


<div class="main-box">
	<h1>Per Scholas USA</h1>
	<p>Americas's One Of The Best Coding Boot Camp.</p>
	<button>ENROLL NOW</button>
</div>
<div class="container">
	<h2>FACILITIES</h2>
	<div class="row">
		<div class="column">
			<!-- <a href=""><img src="" alt=""></a> -->
			<img alt=" " src="<c:url value="https://i.ytimg.com/vi/SisFfGySxu8/sddefault.jpg" />">
			<a href="">CAMPUS</a>
		</div>
		<div class="column">
			<!-- <a href=""><img src="" alt=""></a> -->
			<img alt=" " src="<c:url value="https://www.marseille-airport.com/fileadmin/user_upload/la-cantine-des-voyageurs_full_restaurant.jpg" />">
			<a href="">CANTINE</a>
		</div>
		<div class="column">
			<!-- <a href=""><img src="/images/library.jpg" alt=""></a> -->
			<img alt=" " src="<c:url value="https://www.crl.edu/sites/all/themes/crl_bootstrap/images/hero3.jpeg" />">
			
			
			<a href="">LIBRARY</a>
		</div>
	</div>
</div>

</body> 
</html> 