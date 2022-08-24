<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자동차 등록</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>자동차 정보 등록</header>
		<form name=form1 action="http://localhost:8080/myweb/car/register/" method="post">
		<table>	
			<tr><th>차</th><td><input type="text" name="carModel" autofocus></td></tr>
			<tr><th>색상</th><td><input type="text" name="carColor"></td></tr>
			<tr><th>가격</th><td><input type="text" name="carPrice"></td></tr>
			<tr><th>연료</th><td><input type="text" name="carFuel" placeholder="공백없이 입력하세요"></td></tr>
			<tr><th>연비</th><td><input type="text" name="carFuelefficiency"></td></tr>
			<tr><th>재고</th><td><input type="text" name="carStock"placeholder="정수로 입력하세요"></td></tr>
			<tr><th>출력</th><td><input type="text" name="carOutput"></td></tr>
			<tr><th>엔진</th><td><input type="text" name="carEngine"></td></tr>
		</table>
		<dl>
			<dd><input type="submit" name="submit" value="보내기"></dd>
			<dd><input type="reset" name="reset" value="다시 작성"></dd>
		</dl>
		</form>
	</div>
</body>
</html>