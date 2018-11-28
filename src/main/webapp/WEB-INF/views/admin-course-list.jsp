<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADmin Course List</title>
</head>
<body>
<h1>Course List</h1>
	<table>
			<thead class="thead-dark">
				<tr>
					<th scope="col">Category</th>
					<th scope="col">Name</th>
				
				
				</tr>
			</thead>
			<tr>
			</tr>
			<c:forEach var="c" items="${ courses }">
				<tr>
				
					<td>${ c.category }</td>
					<td>${ c.name}</td>
				
				
				</tr>
			</c:forEach>
		</table>
<a href="/admin-home">Go back</a>
</body>
</html>