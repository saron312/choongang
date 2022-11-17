<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="myfunc" uri="/WEB-INF/tlds/el-functions.tld"%>
    <%
    List<Long> values = Arrays.asList(1L,2L,5L,10L);
    request.setAttribute("vals",values);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${myfunc:sum(vals)}
</body>
</html>