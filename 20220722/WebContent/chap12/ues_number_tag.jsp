<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>numberFormat 태그 사용</title>
</head>
<body>
<c:set var = "price" value="10000"/>
<fmt:formatNumber value="${price}" type="number" var="numberType"/>
${numberType}원
<br/>
통화:<fmt:formatNumber value="${price}" type="currency" currencySymbol="$"/>
<br/>
<fmt:formatNumber value="${price}" pattern="00000000.00"/>
</body>
</html>