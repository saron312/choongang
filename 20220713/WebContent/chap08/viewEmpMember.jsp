<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="EmpInfo" class="member.EmpInfo" />
<jsp:setProperty name="EmpInfo" property="*" />
<%
	String employee_id = request.getParameter("employee_id");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원 정보</title>
</head>
<body>
	<%
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "c##hr";
			String pw = "hr";
			String sql = "select * from employees where employee_id ='"+employee_id+"'";
			conn = DriverManager.getConnection(url, id, pw);
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			if (rs.next()) {
				
	%>
	<jsp:setProperty name="EmpInfo" property="first_name" value='<%=rs.getString("first_name") %>'/>
	<jsp:setProperty name="EmpInfo" property="salary" value='<%=rs.getString("salary") %>'/>
	<jsp:setProperty name="EmpInfo" property="email" value='<%=rs.getString("email") %>'/>
	
	<table width="400" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>아이디</td>
			<td><%=employee_id%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><jsp:getProperty name="EmpInfo" property="first_name"/></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><jsp:getProperty name="EmpInfo" property="salary"/></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><jsp:getProperty name="EmpInfo" property="email"/></td>
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