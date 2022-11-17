<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>인사기록 폼</title>
</head>
<body>
<form action="insertEmp.do" method="post" >
이름 &nbsp;&nbsp;&nbsp;<input type="text" name="empName"> <br/>
주소 &nbsp;&nbsp; <input type="text" name="empAdd"><br/>
핸드폰 &nbsp;&nbsp; <input type="tel" name="empTel" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" title="###-####-####"><br/>
증명사진  <input type="file" name="empImg" accept=".jpg,.jpeg,.png,.gif"><br/>
첨부파일  <input type="file" name="empFile"><br/>
<input type ="submit" value="제출">
</form>
</body>
</html>