
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String empId = request.getParameter("id");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	String url ="jdbc:mysql://localhost:3306/test0805?useUnicode=true&characterEncoding=uf8";
	String id = "root";
	String pw = "rootpw";
	String sql = "select * from emp where empId = '"+empId+"'";
	
	
	
	conn = DriverManager.getConnection(url, id, pw);
	st = conn.createStatement();
	rs = st.executeQuery(sql);
%>
	<table border ="1">
<% if(rs.next()){ %>
	<tr>
		<td><%= rs.getInt("empId") %></td>
		<td><%= rs.getString("empName") %></td>
		<td><%= rs.getString("empTel") %></td>
		<td><%= rs.getString("empAdd") %></td>
	<%} %>
	</table>
</body>
</html>