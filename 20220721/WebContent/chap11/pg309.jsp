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
<c:url value="http://search.daum.net/search" var="searchUrl">
<c:param name ="w" value="blog"/>
<c:param name ="q" value="공원"/>
</c:url>

<a href="${searchUrl}">다음 검색</a>

<ul>
	<li><a href='<c:url value="./pg305.jsp"/>'>1</a></li>
	<li><a href='<c:url value="/pg305.jsp"/>'>2</a></li>
	<li><c:url value="/pg284.jsp"/></li>
</ul>
<c:redirect url="http://search.daum.net/search">
	<c:param name="w" value="blog" />
	<c:param name="q" value="보라매 공원"/>
</c:redirect>

</body>
</html>