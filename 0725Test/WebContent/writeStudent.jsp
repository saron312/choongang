<%@ page contentType="text/html; charset=utf-8" %>
<%@ page errorPage="errorView.jsp" %>
<%@ page import="student.model.Student" %>
<%@ page import="student.service.WriteStudentService" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="student" class="student.model.Student">
	<jsp:setProperty name="student" property="*" />
</jsp:useBean>
<%
	WriteStudentService writeService = WriteStudentService.getInstance();
	writeService.write(student);
%>
<html>
<head>
	<title>학생 정보 추가</title>
</head>
<body>
학생 정보를 추가하였습니다.
<br/>
<a href="list.jsp">[목록 보기]</a>
</body>
</html>