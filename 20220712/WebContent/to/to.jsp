<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>to.jsp의 실행 결과</title>
</head>
<body>
<% String ss = request.getParameter("cnt"); %>
<%= ss %>
이 페이지는 to.jsp가 생성함
</body>
</html>