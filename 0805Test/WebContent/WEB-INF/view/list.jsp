<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원 목록</title>
</head>
<body>

<c:if test="${viewEmp.isEmpty()}">
	등록된 사원이 없습니다.
</c:if>

<c:if test="${!viewEmp.isEmpty()}">
<table border="1">
<tr>
	<th>사원번호</th>
	<th>성명</th>
	<th>핸드폰번호</th>
	<th>삭제</th>
</tr>
<c:forEach var="emp" items="${view.empList}">
<tr>
	<td>${emp.empId}</td>
	<td>${emp.empName}</td>
	<td><a href="empinfo.do?empId=${emp.empId}">${emp.empTel}</a></td>
	<td><a href="delConfirm.do?empId=${emp.empId}">X</a></td>
</tr>
</c:forEach>
</table>
<c:forEach var="pageNum" begin="1" end="${view.pageEndCount}">
	<a href="list.do?page=${pageNum}">[${pageNum}]</a>
</c:forEach>
</c:if>
</body>
</html>