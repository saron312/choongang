<%@page import="chap11.Member"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    List<Member> mbList = Arrays.asList(
    		new Member("홍길동",20),
    		new Member("이순신",54),
    		new Member("유관순",19),
    		new Member("왕건",42)
    		);
    request.setAttribute("members",mbList);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${lst = members.stream().map(m->m.name).toList();''}
${lst}
${arr = members.stream().map(m-<m.age).toArray();''}
${arr }
${members.stream().sorted((m1,m2)->m1.age.compareTo(m2.age)).toList()}
</body>
</html>