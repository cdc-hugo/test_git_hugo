<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello,springboot....</h1>
	img:<img src="/static/imgs/1.gif">

	<form action="uploadFile" method="post" enctype="multipart/form-data">
		<input type="file" name="mf" /><br />
		<input type="submit" />
	</form>
	
	
</body>
</html>