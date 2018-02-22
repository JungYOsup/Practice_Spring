<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setContentType("text/html; charset=utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function boardlist() {
		location.href="boardlist.do";
	}
</script>
</head>
<body>
	<div>
		<h1>게시글작성하기</h1>
		<form action="insertboard.do" method="post">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea cols="60" rows="10" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="글작성"/>
						<input type="button" value="목록" onclick="boardlist()"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>