<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel ="stylesheet" href = "/style.css">

<title>Recipes</title>
</head>
<body>
<p> this is our awesome recipe for you!</p>
<p>label ${result[0]} </p>
<p>label <a href="${result[1].recipe.url}"> ${result[1].recipe.label} </a>
<img class="image" src="${result[1].recipe.image}">
 </p>


</body>
</html>