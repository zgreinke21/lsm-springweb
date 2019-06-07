<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<base href="${pageContext.request.contextPath }/" />
<title>편지 쓰기</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/header.jsp"%>
	<h2>편지 쓰기</h2>
	<form action="./app/letter/add" method="post">
		<p>
			받는이 : <input type="text" name="receiverId" value="${param.receiverId }"
				readonly /> | <input type="text" name="receiverName"
				value="${param.receiverName }" readonly />
		</p>
		<p>제목 :</p>
		<p>
			<input type="text" name="title" maxlength="100" style="width: 100%;" required>
		</p>
		<p>내용 :</p>
		<p>
			<textarea name="content" style="width: 100%; height: 200px;" required></textarea>
		</p>
		<p>
			<button type="submit">등록</button>
		</p>
	</form>
</body>
</html>