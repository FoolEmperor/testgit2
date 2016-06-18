<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>request.getParameter获取参数</h2>
	<br/>
	<form action="param/get">
		<input name="name" type="text" value="sub_get"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<form action="param/post" method="post">
		<input name="name" type="text" value="sub_post"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<h2>@RequestParam获取参数</h2>
	<br/>
	<form action="param/getparam">
		<input name="name" type="text" value="sub_get"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<form action="param/postparam" method="post">
		<input name="name" type="text" value="sub_post"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<h2>@PathVariable获取参数</h2>
	<br/>
	<a  href="param/getpath/jian/123456">@PathVariable获取参数</a>
	<br/>
	<h2>@ModelAttribute获取参数</h2>
	<br/>
	<form action="param/postattribute" method="post">
		<input name="userName" type="text" value="小明"> 
		<input name="password" type="text" value="123456"> 
		<input name="age" type="text" value="18"> 
		<input name="sex" type="text" value="男">
		<input type="submit" value="提交" />
	</form>
	<br/>
	
	<br/>
</body>
</html>