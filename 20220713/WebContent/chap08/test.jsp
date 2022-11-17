<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id= "Emp" class="member.Employee"/>
<jsp:setProperty name ="Emp" property="*"/>


<%
	String employee_id = request.getParameter("employee_id");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Class.forName("oracle.jdbc.OracleDriver");

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	try{
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String id = "c##hr"; 
	String pw = "hr";    
	
	conn = DriverManager.getConnection(url,id,pw);
	st = conn.createStatement();
	
	String sql = "select * from employees where employee_id = '"+employee_id+"'";

	rs = st.executeQuery(sql);
	if(rs.next()){
%>

<% Emp.setEmployee_id(rs.getString("employee_id")); %>
<% Emp.setFirst_name(rs.getString("first_name")); %>
<% Emp.setSalary(rs.getInt("salary")); %>

<table border="1">
<tr>
	<td>아이디22</td><td><%=employee_id %></td>
</tr>
<tr>
	<td>이름</td><td><jsp:getProperty name ="Emp" property ="first_name"/></td>
</tr>	
<tr>
	<td>연봉</td><td><jsp:getProperty name ="Emp" property ="salary"/></td>
</tr>
	
</table>
	<%
		} else {
	%>
	<%=employee_id%>에 해당하는 정보가 존재하지 않습니당.
	<%
		}
		} catch (SQLException ex) {
	%>
	에러발생 <%=ex.getMessage()%>
	<%
		} finally {
			if (rs != null) try {rs.close();} catch (SQLException ex) {}
			if (st != null) try {st.close();} catch (SQLException ex) {}
			if (conn != null) try {conn.close();} catch (SQLException ex) {}
		}
	%>
</body>
</html>