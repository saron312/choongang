<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>
    <jsp:useBean id="memberInfo" class="member.MemberInfo"/>
    <jsp:setProperty name="memberInfo" property="*"/>
    <jsp:setProperty name="memberInfo" property="password" value="<%= memberInfo.getId() %>"/>
    <!--<jsp:setProperty name="memberInfo" property="password"/>-->

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>가입</title>
</head>
<body>
<table width="400" border="1" cellpadding="0" cellspacing="0">
<tr>
	<td>아이디</td>
	<td><jsp:getProperty name="memberInfo" property="id"/></td>
	<td>암호</td>
	<td><jsp:getProperty name="memberInfo" property="password"/></td>
</tr>
<tr>
	<td>이름</td>
	<td><jsp:getProperty name="memberInfo" property="name"/></td>
	<td>이메일</td>
	<td><jsp:getProperty name="memberInfo" property="email"/></td>
</tr>
</table>
</body>
</html>