<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<h2>게시판 입니다</h2>
	<table border="1" width="500">
		<thead>
			<tr>
				<td align="center">게시판 번호</td>
				<td align="center">제목</td>
				<td align="center">글쓴 날짜</td>
				<td align="center">추천수</td>
			</tr>
		</thead>
	</table>
	<button onclick="location.href='/board/input.jsp'">글쓰기</button>
</body>