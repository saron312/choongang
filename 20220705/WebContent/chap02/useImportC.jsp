<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
    <%@page pageEncoding="utf-8"%>
 	<%@page import = "java.util.Calendar" %>
 	<%@page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Calendar 클래스 사용</title>
</head>
<body>
	<%Calendar cal = Calendar.getInstance(); %>
	오늘은
	<%= cal.get(Calendar.YEAR) %>년
	<%= cal.get(Calendar.MONTH)+1 %>월
	<%= cal.get(Calendar.DATE) %>일
	입니당.
</body>
</html>