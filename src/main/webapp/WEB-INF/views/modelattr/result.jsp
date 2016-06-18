<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${param_var }</h1>
	<h1>${param_var2 }</h1>
	<c:if test="${user!=null}">
		用户名：${user.userName}<br/>
		密码：${user.password}<br/>
		年龄：${user.age}<br/>
		性别：${user.sex}<br/>
	</c:if>
	<c:if test="${user2!=null}">
		用户名：${user2.userName}<br/>
		密码：${user2.password}<br/>
		年龄：${user2.age}<br/>
		性别：${user2.sex}<br/>
	</c:if>
</body>
</html>