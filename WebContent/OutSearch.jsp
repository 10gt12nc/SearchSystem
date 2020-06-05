<%@page import="tw.com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="Search.jsp"/>

	<%
		List<Product> allp = (List<Product>) request.getAttribute("Products");
	%>

	<table>
		<tr>
			<th>品名</th>
			<th>價錢</th>
			<th>剩餘數量</th>
		</tr>

		<%
			for (Product products : allp) {
		%>

		<tr>
			<td><%=products.getName()%></td>
			<td><%=products.getPrice()%></td>
			<td><%=products.getRemnant()%></td>
		</tr>

		<%
			}
		%>
	</table>

</body>
</html>