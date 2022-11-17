<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원 정보 삭제 확인창</title>
</head>
<body>
삭제하려는 사원의 정보를 확인해주세요.<br/>
<hr>
사원번호 :${emp.empId} <br/>
이름 :${emp.empName} <br/>
주소 :${emp.empAdd}<br/>
핸드폰 번호 : ${emp.empTel} <br/><br/>

맞으면 확인 버튼을 눌러주세요.<br/>
<a href="delete.do?empid=${emp.empId}">[확인]</a> /
<a href="list.do">[이전으로 돌아가기]</a>
</body>
</html>