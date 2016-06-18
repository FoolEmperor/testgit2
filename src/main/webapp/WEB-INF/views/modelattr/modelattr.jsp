<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>@ModelAttribute注释方法 </h2>
	<br/>
	<form action="modelattr/result2">
		<input name="param" type="text" value="sub_get"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<h2>@ModelAttribute注释方法 </h2>
	<br/>
	<form action="modelattr/result">
		<input name="param" type="text" value="sub_get"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<h2>@ModelAttribute注释方法参数 </h2>
	<br/>
	<form action="modelattr/anno">
		<input name="param" type="text" value="sub_get"> <input
			type="submit" value="提交" />
	</form>
	<br/>
	<br/>
</body>
</html>