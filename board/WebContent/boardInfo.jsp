<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="enconding">
<title>게시글 정보</title>
</head>
<body>
<h2>게시글 정보 입니다.</h2>
	제목 : ${requestScope.title }<br>
	내용 <br>
	${requestScope.content }<br>
	작성 일자 : ${requestScope.date }
	
	<%-- <c:if test="${memberId == sessionScope.memberId }">
	</c:if> --%>
	<button onclick="location.href='${initParam.rootPath }/modify.jsp'">수정</button>
	<button onclick="location.href='${initParam.rootPath }/SelectController'">뒤로가기</button>
</body>
</html>