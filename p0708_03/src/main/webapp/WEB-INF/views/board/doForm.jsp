<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>doForm</title>
			<style>
				table,th,td{border: 1px solid black; border-collapse: collapse;}
				th,td{width:200px;}
			</style>
		</head>
	<body>
	<h2>form에서 넘어온 데이터</h2>
	<table>
	<tr>
		<th>데이터</th>
		<th>값</th>
	</tr>
	<tr>
		<td>아이디(bid)</td>
		<td>${bid}</td>
	</tr>
	<tr>
		<td>패스워드(bpw)</td>
		<td>${bpw}</td>
	</tr>
	<tr>
		<td>이름(bname)</td>
		<td>${bname}</td>
	</tr>
	<tr>
		<td>번호(bphone)</td>
		<td>${bphone}</td>
	</tr>
	<tr>
		<td>성별(bgender)</td>
		<td>${bgender}</td>
	</tr>
	</table>
	</body>
</html>