<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrapHead.jsp" />
<title>TOKEN INFO</title>
</head>
<body>

	<form action="editToken.do" method="POST">
	<input type="hidden" name="id" value="${c.id}"/>
	
	<h1>${c.name}<input type="text" name="editname" placeholder="Edit name" /></h1>
	<hr>

		<table class="table table-striped table-hover">
			<tr>
				<th>ID</th>
				<th>Symbol</th>
				<th>Description</th>
			</tr>

			<tr>
				<td>${c.id}</td>
				<td>${c.token}</td>
				<td>${c.description}</td>
			</tr>
			
				<tr>
				<td></td>
				<td><input type="text" name="editsymbol"
					placeholder="Edit symbol" /></td>
				<td><input type="text" name="editdescription"
					placeholder="Edit description" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Update token" /></td>
				<td></td>
			</tr>
		</table>
	</form>




	<br>

	<hr>



	<a href="index.do">Return to Main Menu</a>
</body>
</html>






