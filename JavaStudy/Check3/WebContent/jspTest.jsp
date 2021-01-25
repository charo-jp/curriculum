<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type ="text/css" href="${pageContext.request.contextPath}/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JspTest</title>
</head>
<body>
	<%@ include file="header.jsp" %>
<!-- name、idの入力エリアを作成しなさい -->
	<div class = "main">
		<p><label class="name">name</label><input type="text" name ="name"></p>
		<p><label class ="name">id</label><input type ="text" name ="id"></p>
	</div >
	<%@ include file ="footer.jsp" %>
</body>
</html>