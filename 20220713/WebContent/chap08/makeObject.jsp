<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="member" scope ="request" class="member.MemberInfo"/>
<%
	member.setId("madvirus");
	member.setName("최범균");
%>
<jsp:forward page="/chap08/useObject.jsp"/>
</body>
</html>