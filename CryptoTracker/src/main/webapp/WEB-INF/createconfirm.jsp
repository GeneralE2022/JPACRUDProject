<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrapHead.jsp" />
<nav class="navbar navbar-light bg-light">
	<a class="navbar-brand" href="./">Welcome to the Crypto Tracker</a> <a
		class="navbar-brand" href="./">Home</a>
</nav>
<title>Create confirm</title>
</head>
<body>
	<h3>Create confirmed...</h3>
	<br>
	<br> ${newcrypto.name }
	<br> ${newcrypto.token }
	<br> ${newcrypto.description }

	<br>
	<br>
	<a href="index.do">Return to Main Menu</a>

</body>
</html>