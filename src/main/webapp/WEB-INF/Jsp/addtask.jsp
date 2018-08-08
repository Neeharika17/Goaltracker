<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/smoothness/jquery-ui.min.css" />
    
<title>Add task</title>
<link href="webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<!-- bootstrap -->

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
<form action="/savetask">

<input  name="id" type="hidden" value="${userId }"> 
<div class="form-group">
<label>Description:</label>
<input type="text" class="form-control" name="desc" />
</div>
<div class="form-group">
<label>Date:</label> <input type="text" class="form-control" id="datepicker" placeholder="Click to pick date" size="30" name="fulldate"></p>

</div>
<button class="btn btn-primary" type="submit">Submit</button>
 </form>
 </div>
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
 <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
 <script>
// $( "#myDatepicker" ).datepicker();
$( "#datepicker" ).datepicker({ dateFormat: 'yy-mm-dd' });
</script>
</body>
</html>

