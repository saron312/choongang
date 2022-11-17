<%--@ variable name-given="x" scope="AT_BEGIN" --%>
<%@ variable name-given="x" scope="NESTED" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
${x}**<br/>
<c:set var="x" value="2"/>
<jsp:doBody/>
${x}*<br/>
<c:set var="x" value="4" />