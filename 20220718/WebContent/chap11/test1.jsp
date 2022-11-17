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
<c:if test="${param.age >18 }">
당신의 나이는 18세 이상입니다.<br/>
</c:if>
<c:if test="${param.pw == 'bk'}">
name 파라미터 값은 ${param.id} 입니다.<br/>
</c:if>
<c:set var="m" value="홍길동"/>
${m} 입니다.<br/>
<c:remove var="m"/>
${m} 입니다.<br/>
<c:if test="true">
무조건 실행 <br/>
</c:if>
<c:if test="false">
실행안됨 <br/>
</c:if>
</body>
</html>