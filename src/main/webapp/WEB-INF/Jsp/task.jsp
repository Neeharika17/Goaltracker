<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<title>User Tasks</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">




</head>

<body>

	<%-- hello this is the userid ${userId } --%>


	<nav class="navbar navbar-inverse">
		<div class="container-fluid">


			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout"><span
						class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<a href="/addnew?id=${userId }">ADD</a>
	</div>
	
	<c:if test="${empty value}"> <p> <div id='one' style='display:none;'> <p/> </c:if>


	
	
	<div class="container">
	<div class="tasklist" id="one">
		<h3>User Tasks</h3>
		<table id="example" class="table table-striped table-bordered "
			style="width: 100%">

			<thead>
				<tr>
					<th>Task Id</th>
					<th>Description</th>
					<th>UserId</th>
					<th>Date Id</th>

					<th>Update</th>
					<th>Delete</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${value}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.desc}</td>
						<td>${todo.user.getId()}</td>
						<td>${todo.datedim.getDate_id() }</td>
						<td><a href="/updatetasks?id=${todo.id}">Edit</a></td>
						<td><a href="/deletetask?id=${todo.id}">Delete</a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!--    <script src="https://code.jquery.com/jquery-3.3.1.js"></script> -->
	<script
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#example').DataTable();
		});
	</script>
</body>


</html>
