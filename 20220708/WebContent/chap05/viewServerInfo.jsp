<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

서버정보: <%= application.getServerInfo() %><br>
서블릿 규약 메이저 버전: <%= application.getMajorVersion() %><br>
서블린 규약 마이너 버전: <%= application.getMinorVersion() %><br>
</body>
</html>