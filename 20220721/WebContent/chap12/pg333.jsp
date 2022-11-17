<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="str1" value="Functions <태그>를 사용합니다."/>
<c:set var="str2" value="사용"/>
<c:set var="tokens" value="1,2,3,4,5,6,7,8,9,10"/>
${fn:length(str1)} <br/>
${fn:substring(str1,3,6)}<br/>
${fn:substringAfter(str1,str2)}<br/>
${fn:replace(str1," ","-")}<br/>
<c:set var="array" value='${fn:split(tokens,",")}'/>
${array.stream().toList()}<br/>
${array[0]}<br/>
${array[1]}<br/>
${array[2]}<br/>
${fn:join(array,"-")}
</body>
</html>