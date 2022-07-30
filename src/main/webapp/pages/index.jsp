<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red
}
</style>
<meta charset="UTF-8">
<title>Index.jsp file</title>
</head>
<body>

	<form:form action="showform" modelAttribute="student" method="get">
		<table>

			<tr>

				<td>Student Id :</td>
				<td><form:input path="studId" /></td>
				<td><form:errors path="studId" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Student Name :</td>
				<td><form:input path="studName" /></td>
				<td><form:errors path="studName" cssClass="error" /></td>
			</tr>
			<td>Student Age :</td>
			<td><form:input path="studAge" /></td>
			<td><form:errors path="studAge" cssClass="error" /></td>
	
			<tr>
				<td>Student Phone Number :</td>
				<td><form:input path="studphone" /></td>
				<td><form:errors path="studphone" cssClass="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit"></td>

			</tr>

		</table>



	</form:form>

</body>
</html>