<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    HashMap<String, Object> mapData = new HashMap<String,Object>();
    mapData.put("name","최가");
    mapData.put("today",new Date());
    %>
    <c:set var="map" value="<%=mapData %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" items="${map}">
 ${i.key} = ${i.value} <br/>
</c:forEach>
</body>
</html>