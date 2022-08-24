<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 정보 수정</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>회원 정보 수정</header>
		<form name=form2 action="http://localhost:8080/myweb/member/modify/" method="post">
		<table>
			<tr><th>휴대폰 번호</th><td><input type="text" name="memberMobile" readonly value="${member.memberMobile}"></td></tr>
			<tr><th>이름</th><td><input type="text" name="memberName" value="${member.memberName}"></td></tr>
			<tr><th>구분(개인/사업자)</th><td><input type="text" name="memberDivision" value="${member.memberDivision}"></td></tr>
			<tr><th>이메일</th><td><input type="text" name="memberEmail" value="${member.memberEmail}"></td></tr>
		</table><br>
			<input type="submit" name="submit" value="최종 수정">
			<input type="reset" name="reset" value="다시작성">
		</form>
	</div>
</body>
</html>