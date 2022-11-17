<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String test = request.getParameter("test");
    request.setAttribute("name", "최가"); 
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${cookie['id'].value}<br/>
${cookie.id.value}<br/>
<hr>
${param.code}<br/>
${pageContext.request.requestURI}<br/>
${requestScope.name}<br/>
${name}
</body>
</html>