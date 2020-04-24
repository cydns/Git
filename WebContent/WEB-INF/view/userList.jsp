<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
</head>
<body>
	<h1 align="center">用户列表</h1>
	<table border="1" width="90%" align="center" cellpadding="3">
		<tr>
			<th>ID</th>
			<th>姓名</th>
			<th>出生日期</th>
			<th>地址</th>
		</tr>
		<c:forEach items="${users}" var="u">
			<tr align="center">
				<td>${u.id }</td>
				<td>${u.username }</td>
				<td>${u.birthday }</td>
				<td>${u.address }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>