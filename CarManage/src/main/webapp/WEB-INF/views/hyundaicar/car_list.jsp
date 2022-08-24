<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Car List</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>차 정보 목록</header><br>
		<c:url value="/car/register" var="url"/><a href="${url}">신차 등록</a><br><br>
		<c:url value="/member/list" var="url"/><a href="${url}">회원 목록</a><br><br>
		<c:url value="/sale/list" var="url"/><a href="${url}">판매 목록</a><br><br>
		<table>
		  <tr>
		    <th></th><th>차</th><th>색상</th><th>가격</th><th>연료</th><th>연비</th><th>재고</th><th></th>
		  </tr>
		  <c:forEach var="car" items="${hyundaicars}" >
			  <tr>
			    <td><c:out value="${car.carId}"/></td>
			    <td><c:out value="${car.carModel}"/></td>
			    <td><c:out value="${car.carColor}"/></td>
			    <td><c:out value="${car.carPrice}"/></td>
			    <td><c:out value="${car.carFuel}"/></td>
			    <td><c:out value="${car.carFuelefficiency}"/></td>
			   	<td><c:out value="${car.carStock}"/></td>
			    <td>
			      <c:url value="/car/read?carid=${car.carId}" var="url"/><a href="${url}">더보기</a>
			      <c:url value="/car/modify?carid=${car.carId}" var="url"/><a href="${url}">수정</a>
			      <c:url value="/car/delete?carid=${car.carId}" var="url"/><a href="${url}">삭제</a>
			    </td>
			  </tr>
		  </c:forEach>
		</table>
	</div>
</body>
</html>