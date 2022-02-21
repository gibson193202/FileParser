<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<title>Welcome</title>
<body>
<h2>Please select a file:</h2>
	<form  method="POST" action="result" enctype="multipart/form-data">
		<input type="file" name="txt">
		<br>
		<input type="submit" value="Open">
	</form>
</body>
</html>
