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
${"문자"+="열" }<br/>
<c:forEach var="i" begin="1" end="10">
${sum = sum+i}<br/>
</c:forEach>
총합 ${sum}<br/>
${'총합' += sum }<br/>
<c:choose>
<c:when test="${param.age > 20 }">
당신은 20세 이상입니다. <br/>
	<c:if test="${param.name == 'bk'}">
	당신의 이름은 ${param.name}입니다. <br/>
	</c:if>
</c:when>

<c:otherwise>
모두 아닙니다.
</c:otherwise>
</c:choose>
</body>
</html>