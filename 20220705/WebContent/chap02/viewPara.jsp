<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="java.util.Enumeration" %>
    <%@page import="java.util.Map" %>
    <%
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>요청 파라미터 출력</title>
</head>
<body>





<b>request.getParemeter()메소드 사용</b><br>
name 파라미터 = <%=request.getParameter("name") %><br>
address 파라미터 = <%=request.getParameter("address") %><br>
<p>
<b>request.getParameterValue() 메소드 사용</b><br>
<%
	String[] values = request.getParameterValues("pet");
	if(values != null){
		for(int i=0; i<values.length;i++){
%>
	<%= values[i] %>
<% 
	}
}
%>
<p>
<b>request.getParameterNames()메소드 사용</b><br>
<%
Enumeration paramEnum = request.getParameterNames();
while(paramEnum.hasMoreElements()){
	String name =(String)paramEnum.nextElement();
%>
	<%=name %>
<%
}
%>
<p>
<b>request.getParameterMap() 메소드 사용</b><br>
<%
	Map parameterMap=request.getParameterMap();
	String[] nameParam =(String[])parameterMap.get("name");
	if(nameParam !=null){
%>
name = <%= nameParam[0] %>
<%
	}
%>
</body>
</html>