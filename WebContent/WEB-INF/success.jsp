<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--     <%@ page contentType="text/html;charset=utf-8" pageEncoding="GBK"%>  --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>这里是success 页面</h1>
	<form action="testUpload" method="post" enctype="multipart/form-data">
		选择图片:<input type="file" name="file"><br><br>
		描述图片:<input type="text" name="desc">
		<input type="submit" value="提交">
	</form>
	
</body>
</html>