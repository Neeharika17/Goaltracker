<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/questions">
<input type="hidden" name="email" value=${email }/>
fav_book<input type="text" name="fav_book">
fav_movie<input type="text" name="fav_movie">
fav_city<input type="text" name="fav_city">
<button type="submit">Submit</button>
</form>
</body>
</html>