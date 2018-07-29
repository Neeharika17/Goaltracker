<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="/css/signin.css" rel="stylesheet">

<script src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">
</head>
<body class="text-center">

	<form class="form-signin" method="post" action="/loginUser">
		<!--       <img class="mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72"> -->
		<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
		<label for="inputEmail" class="sr-only">Email address</label> <input
			type="email" id="inputEmail" name="email" class="form-control"
			placeholder="Email address" required autofocus> <label
			for="password" class="sr-only">Password</label> <input
			type="password" id="inputPassword" name="password"
			class="form-control" placeholder="Password" required>
		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<div>
		<a href="/forgot">Forgot Password</a>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>
		<a href="/signup">Sign Up</a> <a href="/adminlogin">Admin Login</a>
	</form>
</body>





</html>