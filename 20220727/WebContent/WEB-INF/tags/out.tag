<%@ tag body-content="tagdependent" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="test" %>
<jsp:doBody var="${test}"/>
<c:out value="${test}" escapeXml="true"/>