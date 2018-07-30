<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Users</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    
    <ul class="nav navbar-nav navbar-right">
      <li><a href="/logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<div class="container">
<h3>User List</h3>
<table class="table table-bordered">
			
			<thead>
				<tr>
					<th>User Id</th>
					<th>Name</th>
					<th>Email</th>
					<th></th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${value}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.name}</td>
						<td>${todo.email}</td>
						<td><a href="/deleteuser?id=${todo.id}" onclick="return confirm('Are you sure you want to delete?');">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>	

</body>
</html>