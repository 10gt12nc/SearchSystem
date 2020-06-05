<%@page import="tw.com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		<jsp:include page="Search.jsp" />
	</p>

	<table border="1" width="300" height="200" Cellpadding="5"
		Cellspacing="5" align="left" bgcolor="#e9faff">

		<caption align="bottom">所有鞋款</caption>

		<tr>
			<th>品名</th>
			<th>價錢</th>
			<th>剩餘數量</th>
		</tr>
		<c:forEach items="${Products}" var="products">


			<tr>
				<!-- %=products.getName()% -->
				<td>${products.name}</td>
				<td>${products.price}</td>
				<td>${products.remnant}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>