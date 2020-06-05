<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		<font color="red">${message}</font>
	</p>

	<form action="search" method="post">

		<input type="text" name="search">
		<button type="submit">搜尋</button>

	</form>

</body>
</html>