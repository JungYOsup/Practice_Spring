<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
	
<script type="text/javascript">

//전체선택 체크박스 구현
function allSel(bool) {
	$("input[name=chk]").prop("checked", bool)
	
	
}
function insertForm() {
	location.href="insertform.do";
}



</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>전체 받기</title>
</head>



<body>

	<jsp:useBean id="util" class="com.hk.answerboard.dbinfo.Util" />
	<form action="muldel.do" method="post">
		<table border="2">

			<col width="50px">
			<col width="50px">
			<col width="100px">
			<col width="200px">
			<col width="100px">
			<col width="50px">
			<col width="50px">
			<col width="50px">
			<col width="50px">
			<col width="50px">
			
			<tr>
				<th><input type="checkbox" name="all"></th>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>refer</th>
				<th>step</th>
				<th>depth</th>
				<th>삭제</th>
			</tr>

			<c:choose>
				<c:when test="${empty lists}">

					<tr>
						<td colspan="10">-------작성된 글이 없습니다-----</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${lists}" var="dto">
						<tr>
							<td><input type="checkbox" name="chk" value="${dto.seq}">
							</td>
							<td>${dto.seq}</td>
							<td>${dto.id }</td>

							<c:choose>
								<c:when test="${dto.delFlag=='Y'}">
									<td>-----삭제된 글 입니다 -------</td>


								</c:when>

								<c:otherwise>

									<td><jsp:setProperty property="arrowNbsp" name="util"
											value="${dto.depth}" /> <!--설명 :객체명(usebean에 설정된 id)이 util이고 그 클래스의 맴버필드가 arrowNbsp의 파라미터에 value값을 넣어준다. -->
										<jsp:getProperty property="arrowNbsp" name="util" /> <!--설명  :객체명이(usebean에 설정된 id) util이고 그 클래스의 맴버필드가 arrowNbsp에 값을 가져온다.-->
									</td>


								</c:otherwise>
							</c:choose>
							<td><f:formatDate value="${dto.regDate}"
									pattern="yyyy년 MM월 DD일" /></td>
							<td>${dto.readCount}</td>
							<td>${dto.refer}</td>
							<td>${dto.step}</td>
							<td>${dto.depth}</td>
							<td>${dto.delFlag}</td>


						</tr>


					</c:forEach>

				</c:otherwise>

			</c:choose>

			<tr>
				<td colspan="10"><input type="button" value="글추가" onclick="insertForm()"> 
				<input type="submit" value="삭제">
				</td>

			</tr>



		</table>
			</form>
</body>
</html>