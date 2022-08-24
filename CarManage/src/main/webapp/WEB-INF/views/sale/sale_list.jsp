<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sale List</title>
<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>판매 완료 목록</header>
		<c:url value="/car/list" var="url" />
		<a href="${url}">차량 목록</a><br> <br>
		<c:url value="/member/list" var="url" />
		<a href="${url}">회원 목록</a><br> <br>
		<table>
			<tr>
				<th>차량ID</th>
				<th>차량</th>
				<th>소유주 번호</th>
				<th>소유주 이름</th>
				<th>차량 번호</th>
			</tr>
			<c:forEach var="sale" items="${saledlist}">
				<tr>
					<td><c:out value="${sale.saleCarId}" /></td>
					<td><c:out value="${sale.saleCarModel}" /></td>
					<td><c:out value="${sale.saleMemberMobile}" /></td>
					<td><c:out value="${sale.saleMemberName}" /></td>
					<td><c:out value="${sale.saleCarNumber}" /></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>