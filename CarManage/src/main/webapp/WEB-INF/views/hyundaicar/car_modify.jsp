<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>정보 수정</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>자동차 정보 수정</header>
		<form name=form1 action="http://localhost:8080/myweb/car/modify/" method="post">
		<table>
		    <tr><th>id</th><td><input type="text" name="carId" readonly value="${car.carId}"></td></tr>
			<tr><th>차</th><td><input type="text" name="carModel" value="${car.carModel}"></td></tr>
			<tr><th>색상</th><td><input type="text" name="carColor" value="${car.carColor}"></td></tr>
			<tr><th>가격</th><td><input type="text" name="carPrice" value="${car.carPrice}"></td></tr>
			<tr><th>연료</th><td><input type="text" name="carFuel" value="${car.carFuel}"></td></tr>
			<tr><th>연비</th><td><input type="text" name="carFuelefficiency" value="${car.carFuelefficiency}"></td></tr>
			<tr><th>재고</th><td><input type="text" name="carStock" value="${car.carStock}"></td></tr>
			<tr><th>출력</th><td><input type="text" name="carOutput" value="${car.carOutput}"></td></tr>
			<tr><th>엔진</th><td><input type="text" name="carEngine" value="${car.carEngine}"></td></tr>
		</table><br>
			<input type="submit" name="submit" value="최종 수정">
			<input type="reset" name="reset" value="다시작성">
		</form>
	</div>
</body>
</html>