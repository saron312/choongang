<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	if (id.equals(password)) {
		session.setAttribute("MEMBERID", id);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 성공</title>
</head>
<body>
로그인에 성공했습니다.
</body>
</html>
<%
	} else {//로그인 실패시
%>
<script>
	alert("로그인에 실패하였습니다.");
	history.back();
</script>
<%
	}
%>