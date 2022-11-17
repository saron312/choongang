<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>
<jsp:doBody var="content" scope="page"/>
<%
	String content=(String)jspContext.getAttribute("content");
	content = content + "***";
%>
<%= content %>