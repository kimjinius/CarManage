<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차 상세정보</title>
<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>차 상세정보</header>
		<br>
		<table>
			<tr>
				<th>ID</th>
				<td><c:out value="${car.carId}" /></td>
			</tr>
			<tr>
				<th>차</th>
				<td><c:out value="${car.carModel}" /></td>
			</tr>
			<tr>
				<th>색상</th>
				<td><c:out value="${car.carColor}" /></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><c:out value="${car.carPrice}" /></td>
			</tr>
			<tr>
				<th>연료</th>
				<td><c:out value="${car.carFuel}" /></td>
			</tr>
			<tr>
				<th>연비</th>
				<td><c:out value="${car.carFuelefficiency}" /></td>
			</tr>
			<tr>
				<th>재고</th>
				<td><c:out value="${car.carStock}" /></td>
			</tr>
			<tr>
				<th>출력</th>
				<td><c:out value="${car.carOutput}" /></td>
			</tr>
			<tr>
				<th>엔진</th>
				<td><c:out value="${car.carEngine}" /></td>
			</tr>
		</table>
		<c:url value="/sale/carlist" var="url" />
		<a href="${url}">차 목록으로 돌아가기</a> <br>
		<c:url value="/sale/carsale?carid=${car.carId}" var="url" />
		<a href="${url}">차량 구매하기</a>
	</div>

	<br>
	<br>
</body>
</html>