<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${fac = n-> n==1? 1:n*fac(n-1);''}
${fac(6)} <br/>
${((a,b)->a>b? true:false)(1,3)} <br/>
${greaterThan =(a,b)->a>b? "참":"거짓";''}
${greaterThan(1,3)}
</body>
</html>