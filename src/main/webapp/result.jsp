<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Result</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-sm-3">
<h3><a name="#top">Содержание:</a></h3>
<ul>
<c:forEach var="item" items="${text}">
	<li><a href="#${item.getReference()}">${item.getHeading()}</a></li>
</c:forEach>
</ul>
</div>
<br>
<div class="col-sm-7">
<c:forEach var="item" items="${text}">
	<p><a name="${item.getReference()}" href="#top">${item.getHeading()}</a></p>
	<p>${item.getText()}</p>
</c:forEach>
</div>
</div>
</div>
</body>
</html>