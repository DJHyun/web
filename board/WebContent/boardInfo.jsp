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
	작성 일자 : ${requestScope.date }<br>
	
	<%-- <c:if test="${memberId == sessionScope.memberId }">
	</c:if> --%>
	<button onclick="location.href='${initParam.rootPath }/modify.jsp'">수정</button><br><!-- ModifyServlet으로 가야할거같은...? 그리고 서블릿은 원래 있던 글정보를 받아오는 서블릿이고, 그 서블릿이 다음으로 향할 곳은 modify.jsp인 거고, 그 modify.jsp는 서블릿이 뿌려준 걸 갖고있다가 값이 수정되면 그 값 셀렉트 서블릿으로 가서 저장하고 그 서블릿은 보드뷰로 -->
	<button onclick="location.href='${initParam.rootPath }/DeleteController?id=${requestScope.id }'">삭제</button><br>
	<button onclick="location.href='${initParam.rootPath }/SelectController'">뒤로가기</button>
</body>
</html>