<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>server端检查param</h2>
	<br/>
	<form action="form/check" method="post">
		<input name="name" type="text" value="小明"> 
		<input name="password" type="text" value="123456"> 
		<input name="birthday" type="text" value="18"> 
		<input name="sex" type="text" value="男">
		<input name="email" type="text" value="4211@qq.com">
		<input type="submit" value="提交" />
	</form>
	<br/>
	
	<br/>
</body>
</html>