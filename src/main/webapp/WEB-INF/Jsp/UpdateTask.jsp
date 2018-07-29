<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Task</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark justify-content-right">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="/loginUser">Home</a>
    </li>
  
  </ul>
</nav>
</br>

<div class="container">
				<form action="/updatetasks" method="post" >
					
					
						<input type="hidden" name="id" value="${value.id }"/>
						<div class="form-group">
						 <input type="text"  class="form-control" name="desc" value="${value.desc}" />
						 </div>
						<input type="hidden" name="userid" value="${value.user.getId()}" />
						<input type="hidden" name="dateid" value="${value.datedim.getDate_id()}" />
<%-- 						<td><a href="/saveTask?id=${value.id}">Save</a></td> --%>
                        <button class="btn btn-primary" type="submit">Save</button>
					
					</form>
			
	</div>	

</body>
</html>