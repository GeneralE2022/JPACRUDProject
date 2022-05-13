<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrapHead.jsp" />

<title>Crypto Tracker</title>
</head>
<body>

	<h2>Welcome to the Crypto Tracker</h2>

	<form action="index.do" method="GET">
		Token ID: <input type="text" name="token" /> <input type="submit"
			value="Show token" />
	</form>
	
	
	<hr>
	<table class="table table-striped table-hover">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Release year</th>
		</tr>

		<c:forEach var="film" items="${films}">
			<tr>
				<td>${film.id}</td>
				<td><a href="getFilm.do?fid=${film.id}">${film.title}</a></td>
				<td>${film.releaseYear}</td>

			</tr>
		</c:forEach>
	</table>


</body>
</html>