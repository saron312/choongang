<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>학생 정보 삭제 확인</title>
</head>
<body>

<form action="deleteStudent.jsp" method="post">
<input type="hidden" name="id" value="${param.id}">
학생 정보를 삭제하시려면 암호를 입력하세요:<br>
이름 확인 : ${param.studentName} <br>
암호: <input type="password" name="password"> <br>
<input type="submit" value="학생 정보 삭제하기">
</form>
</body>
</html>