<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="view.jsp" method="get">
<input type="text" name="sname"><br><br>
<input type="text" name="addr"><br><br>

<input type="checkbox" name="ddd" value="dog">강아지 <br><br>
<input type="checkbox" name="ddd" value="cat">고양잉 <br><br>
<input type="checkbox" name="ddd" value="cow">송아지 <br><br>
<br>

<button>전송</button>
<input type="submit" value="입력">
<input type="reset" value="초기화">
</form>
</body>
</html>