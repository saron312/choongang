<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>학생 정보 수정 확인</title>
</head>
<body>

<form action="correctStudent.jsp" method="post">
<input type="hidden" name="id" value="${param.stid}">
학생 정보를 수정하시려면 암호를 입력하세요:)<br>
이름 확인 : ${param.studentName}<br>
암호: <input type="password" name="password"> <br><br>
점수를 입력하세요.<br>
국어: <input type="text" name="korScore"> <br>
수학: <input type="text" name="mathScore"> <br>
영어: <input type="text" name="engScore"> <br>
<input type="submit" value="학생 정보 수정하기">
</form>
</body>
</html>