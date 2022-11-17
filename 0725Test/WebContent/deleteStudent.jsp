<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="student.service.DeleteStudentService" %>
<%@ page import="student.service.InvalidPassowrdException" %>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	String password = request.getParameter("password");
	boolean invalidPassowrd = false;
	try {
		DeleteStudentService deleteService = 
				DeleteStudentService.getInstance();
		deleteService.deleteStudent(id,password);
	} catch(InvalidPassowrdException ex) {
		invalidPassowrd = true;
	}
%>
<html>
<head>
	<title>학생 정보 삭제함</title>
</head>
<body>
<%  if (!invalidPassowrd) { %>
학생 정보를 삭제하였습니다.
<%  } else { %>
입력한 암호가 올바르지 않습니다. 암호를 확인해주세요.
<%  }%>
<br/>
<a href="list.jsp">[목록 보기]</a>
</body>
</html>