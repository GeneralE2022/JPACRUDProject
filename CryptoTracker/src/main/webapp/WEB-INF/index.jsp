<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrapHead.jsp" />

<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href="./">Welcome to the Crypto Tracker</a>
  <a class="navbar-brand" href="./">Home</a>
</nav>

<title>Crypto Tracker</title>
</head>
<body>


	<form action="getToken.do" method="GET">
		Token ID: <input type="text" name="token" /> <input type="submit"
			value="Show token" />
	</form>

	<hr>

	${crypto.id} ${crypto.name} ${crypto.token} ${crypto.description}


	<hr>
	<table class="table table-striped table-hover">
		<tr>
			<th>ID</th>
			<th>Cryptocurrency</th>
			<th>Symbol</th>
			<th>Description</th>
		</tr>

		<c:forEach var="crypto" items="${cryptos}">
			<tr>
				<td>${crypto.id}</td>
				<td><a href="getToken.do?token=${crypto.id}">${crypto.name}</a></td>
				<td>${crypto.token}</td>
				<td>${crypto.description}</td>

			</tr>
		</c:forEach>
	</table>
	<hr>

	<form action="deleteToken.do" method="GET">
		Delete token: <input type="text" name=delete /> <input type="submit"
			value="Delete token" />
	</form>
	
	<hr>
		<h3>Create your own cryptocurrency</h3>
	
		<form action="createToken.do" method="POST">
		Name: <input type="text" name="newname" /> 
		Symbol: <input type="text" name="newsymbol" /> 
		Description: <input type="text" name="newdescription" /> 
		<input type="submit" value="Create token" />
	</form>
	
	
	


</body>
</html>