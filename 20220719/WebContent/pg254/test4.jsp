<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="myfunc" uri="/WEB-INF/tlds/el-functions.tld"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="mem" value="${{'name':'홍길동','age':20}}"/>
${mem.name}<br/>
${mem.age}<br/>
<c:set var="vals" value="${[1,2,3,5,10]}"/><br/>
${vals[3]}<br/>
${myfunc:sum([4,5,6,7])}<br/>
</body>
</html>