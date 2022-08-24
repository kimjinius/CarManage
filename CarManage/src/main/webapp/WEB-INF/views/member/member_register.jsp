<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 등록</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>학생 정보 등록</header>
		<form name=form1 action="http://localhost:8080/myweb/member/register/" method="post">
		<table>	
			<tr><th>휴대폰번호</th><td><input type="text" name="memberMobile" autofocus placeholder="공백없이 번호만 입력하세요"></td></tr>
			<tr><th>이름</th><td><input type="text" name="memberName" placeholder="공백없이 입력하세요"></td></tr>
			<tr><th>구분(개인/사업자)</th><td><input type="text" name="memberDivision"  placeholder="공백없이 입력하세요"></td></tr>
			<tr><th>이메일</th><td><input type="text" name="memberEmail" placeholder="공백없이 입력하세요"></td></tr>
		</table>
		<dl>
			<dd><input type="submit" name="submit" value="보내기"></dd>
			<dd><input type="reset" name="reset" value="다시 작성"></dd>
		</dl>
		</form>
	</div>
</body>
</html>