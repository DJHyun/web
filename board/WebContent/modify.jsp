<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="enconding">
<title>수정</title>
</head>
<body>
	<h2>수정 하세용 ~~</h2>
	<%-- 제목 : ${requestScope.title }<br>
	내용 <br>
	${requestScope.content }<br>
	작성 일자 : ${requestScope.date }<br> --%>
	
	<form action="${initParam.rootPath }/ModifyController" method="post">
			영화 : <input type="text" name="${requestScope.movie }"/><br>
			평점 : <input type="number" name="${requestScope.score }" max="5" min="0"/><br>
			제목 : <input type="text" name="${requestScope.title }"/><br>
			내용<br>
			<textarea rows = "10" cols = "100" name = "${requestScope.content }"></textarea><br>
			<input type = "submit" value="수정완료"/>
	</form>
			<%-- <input type="submit" value="수정완료"/>
			<input type="reset" value="삭제"/>
			<input type="button" value="뒤로가기" onclick="location.href='${initParam.rootPath }/index.jsp'"/>
			<input type="hidden" name="memberId" value=12/> --%>
		<!-- </form> -->
		
		
	
	<%-- <c:if test="${memberId == sessionScope.memberId }">
	</c:if> --%>
	<button onclick="location.href='${initParam.rootPath }/boardInfo.jsp'">뒤로가기</button>
</body>
</html>