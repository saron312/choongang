<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>구구단</h3>
<ul>
<c:forEach var="i" begin="2" end="9">
	<h4>${i}단</h4>
	<c:forEach var="j" begin="1" end="9">
		<li>${i}x${j}=${i*j}</li>
	</c:forEach>
</c:forEach>
</ul>
<h1>구구단 4단</h1>
<ul>
<c:forEach var="i" begin="1" end="9">
<li>4x${i}=${4*i}</li>
</c:forEach>
</ul>
<c:set var="intArray" value='<%=new String[] {"가","나","다","라","마"} %>'/>
<c:forEach var="i" items= "${intArray}" begin="2" end="4" varStatus="status">
${status.index}-${status.count}=[${i}] <br/>
</c:forEach>
<c:forEach var="i" begin="1" end="10" step="2">
${i}
</c:forEach>
</body>
</html>