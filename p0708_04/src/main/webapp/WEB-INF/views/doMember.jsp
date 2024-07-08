<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>회원정보수정</title>
			<style>
				table,th,td{border: 1px solid black; border-collapse: collapse;}
				th,td{width:200px;}
			</style>
		</head>
	<body>
	<h2>회원가입</h2>
	<form action="memUpdate" method ="post">
	<input type="hidden" name="id" values=${bid}">
	<input type="hidden" name="pw" values=${bpw}">
	<input type="hidden" name="name" values=${bname}">
	<input type="hidden" name="phone" values=${bphone}">
	<input type="hidden" name="gender" values=${bgender}">
	<input type="hidden" name="hobby" values=${hobby}">
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
		<td>전화번호(bphone)</td>
		<td>${bphone}</td>
	</tr>
	<tr>
		<td>성별(bgender)</td>
		<td>${bgender}</td>
	</tr>
	<c:forEach var="hobby" items="${hobbys}" varStatus="status" >
		<tr>
			<td>취미${status.count}</td>
			<td>${hobby}</td>
		</tr>
	</c:forEach>
	
	
	</table>
	<input type="submit" values="수정">
	</form>
	</body>
</html>