<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome to SLC playground!!!
	<h1>Title text</h1>
	<form action="add"> <!-- when we click "Submit" button it would call "add" in the controller-->
		Enter 1st number : <input type="text" name="num1"><br>	<!-- num1 and num2 are var in query html -->
		Enter 2nd number : <input type="text" name="num2"><br>
		<input type="submit">
	</form>
</body>
</html>