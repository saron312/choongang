<%@page import="student.service.StudentScoreService"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="student.model.Student"%>
<%@ page import="student.service.StudentListView"%>
<%@ page import="student.service.GetStudentListService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String pageNumberStr = request.getParameter("page");

	int pageNumber = 1;
	if (pageNumberStr != null) {
		pageNumber = Integer.parseInt(pageNumberStr);
	}

	GetStudentListService studentListService = 
			GetStudentListService.getInstance();
	StudentListView viewData = 
			studentListService.getStudentList(pageNumber);
	
	String idStr = request.getParameter("id");
	int aaa ;
	if (idStr == null){
		aaa = viewData.getFirstRow()+1;
	}else {
		aaa = Integer.parseInt(idStr);
	}
	StudentScoreService studentScoreService = StudentScoreService.getInstance();
	Student student = studentScoreService.selectScore(aaa);
	
%>
<c:set var="viewData" value="<%= viewData %>"/>
<c:set var="stScore" value="<%= student %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생 목록</title>
</head>
<body>
<script>
	function a(){
		var avgScore = ${stScore.avgScore}; 
		var sumScore = ${stScore.sumScore}; 
		var rank = ${stScore.rank};
		var korRank = ${stScore.korRank};
		var mathRank = ${stScore.mathRank};
		var engRank = ${stScore.engRank};
		
		alert("[평균: "+avgScore+" 총점: "+sumScore+"]"+" 전체 석차: "+rank+"등 / "
				+"국어 : "+korRank+"등 / 영어 : "+engRank+"등 / 수학 : "+mathRank+"등");
	}
</script>
<form action="writeStudent.jsp" method="post">
이름: <input type="text" name="studentName"> <br>
암호: <input type="password" name="password"> <br>
국어: <input type="text" name="korScore"> <br>
수학: <input type="text" name="mathScore"> <br>
영어: <input type="text" name="engScore"> <br>
메시지: <textarea name="message" cols="30" rows="3"></textarea> <br>
<input type="submit" value="학생 정보 등록" />
</form>
<hr>
<c:if test="${viewData.isEmpty()}">
등록된 정보가 없습니다.
</c:if>

<c:if test="${!viewData.isEmpty()}">

반 평균 점수 <br><br>
국어 평균:${viewData.getStudentList().stream().map(m->m.korScore).average().get()}<br>
수학 평균:${viewData.getStudentList().stream().map(m->m.mathScore).average().get()}<br>
영어 평균:${viewData.getStudentList().stream().map(m->m.engScore).average().get()}<br>

<hr>
<table border="1" width ="20%">

	<c:forEach var="student" items="${viewData.studentList}">
	<tr>
		<td align = "center">
		학번 : ${student.id} <br/>
		학생 이름 : ${student.studentName} <br/>
		국어 점수 : ${student.korScore} <br/>
		수학 점수 : ${student.mathScore} <br/>
		영어 점수 : ${student.engScore} <br/>
		메시지 : ${student.message} <br/>
		
		<form action="list.jsp?page=${viewData.getCurrentPageNumber()}" method="post">
		<input type="hidden" name="id" value="${student.id}">
		<input type="submit" value="결과보기" onclick="a()"/>
		</form>
		<br/>
		<a href="confirmDeletion.jsp?id=${student.id}&studentName=${student.studentName}">[삭제하기]</a>
		<a href="confirmCorrection.jsp?id=${student.id}&studentName=${student.studentName}">[수정하기]</a>
		</td>
	</tr>
	</c:forEach>
	<caption align="bottom">
		<c:forEach var="pageNum" begin="1" end="${viewData.pageTotalCount}">
			<a href="list.jsp?page=${pageNum}">[${pageNum}]</a>
		</c:forEach>
	</caption>
</table>

	</c:if>
</body>
</html>