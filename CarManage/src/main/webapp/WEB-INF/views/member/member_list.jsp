<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>회원 목록</header>
		<c:url value="/member/register" var="url" />
		<a href="${url}">회원 등록</a><br> <br>
		<c:url value="/car/list" var="url" />
		<a href="${url}">차량 목록</a><br> <br>
		<table>
			<tr>
				<th>전화번호</th>
				<th>이름</th>
				<th>구분</th>
				<th>이메일</th>
				<th></th>
			</tr>
			<c:forEach var="member" items="${members}">
				<tr>
					<td><c:out value="${member.memberMobile}" /></td>
					<td><c:out value="${member.memberName}" /></td>
					<td><c:out value="${member.memberDivision}" /></td>
					<td><c:out value="${member.memberEmail}" /></td>
					<td><c:url
							value="/member/modify?membermobile=${member.memberMobile}"
							var="url" /><a href="${url}">정보 수정</a> 
						<c:url
							value="/member/delete?membermobile=${member.memberMobile}"
							var="url" /><a href="${url}">정보 삭제</a>
						<c:url
							value="/sale/carlist?membermobile=${member.memberMobile}"
							var="url" /><a href="${url}">차량 구매</a>
							</td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>