<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Map<String, String> map = new HashMap<>();
    map.put("code1","코드1");
    map.put("code2","코드2");
    request.setAttribute("map",map);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${map.entrySet().stream().map(entry->entry.value).toList()}<br/>
${lst=[1,2,3,4,5];''}
${lst.stream().filter(x->x%2 ==0).map(x->x*x).toList() }<br/>
${lst.stream().sum() }
</body>
</html>