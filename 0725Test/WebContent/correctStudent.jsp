<%@page import="student.model.Student"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="student.service.CorrectStudentService" %>
<%@ page import="student.service.InvalidPassowrdException" %>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	String password = request.getParameter("password");
	int korScore = Integer.parseInt(request.getParameter("korScore"));
	int mathScore = Integer.parseInt(request.getParameter("mathScore"));
	int engScore = Integer.parseInt(request.getParameter("engScore"));
	boolean invalidPassowrd = false;
	
	try {
		CorrectStudentService correctService = 
				CorrectStudentService.getInstance();
		correctService.correctStudent(id,password,korScore,mathScore,engScore);
	} catch(InvalidPassowrdException ex) {
		invalidPassowrd = true;
	}
%>
<html>
<head>
	<title>학생 정보 수정함</title>
</head>
<body>
<%  if (!invalidPassowrd) { %>
학생 정보를 수정하였습니다.
<%  } else { %>
입력한 이름과 암호가 올바르지 않습니다. 암호를 확인해주세요.
<%  }%>
<br/>
<a href="list.jsp">[목록 보기]</a>
</body>
</html>