<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<%-- 	<c:set var="username" scope="session" value="paul"/>
	
	<c:out value="${username}"/>
	
	<c:if test="${1==1 }">
		<c:out value="hfasfaahah"/>
		<h1>Condition is true</h1>
	</c:if>
	
	<c:if test="${1!=1 }">
		<c:out value="hfasfaahah"/>
		<h1>Condition is true</h1>
	</c:if>
	
	<c:choose>
		<c:when test="${1==3 }">
			<c:out value="adfa"/>
			<h1>Condition 1 is true</h1>
		</c:when>
		<c:when test="${1==1}">
			<h1>Condition 2 is true</h1>
		</c:when>
		<c:otherwise>
			<h1>Otherwise </h1>
		</c:otherwise>
	</c:choose> --%>
	
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<c:forEach  var="student" items="${students}">
			<tr>
				<td>${student.name}</td>
				<td>${student.age}</td>
			</tr>
		</c:forEach>
	</table>
	
	<form action="home" method="POST">
		<label for="ageInput">Name</label><input type="text" name="name" id="nameInput"><br>
		<label for="ageInput">Age</label><input type="text" name="age" id="ageInput"><br>
		<input type="submit">
	</form>
	
<%-- 	<table>
		<tr>
			<th>Name</th>
		</tr>
		<c:forTokens items="CJ|Kim|Christian,Abigail,|Ish" delims=",|" var="student">
			<tr>
				<td>${student}</td>
			</tr>
		</c:forTokens>
	</table> --%>
</body>
</html>