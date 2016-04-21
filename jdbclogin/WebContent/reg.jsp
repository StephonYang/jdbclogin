<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>用户注册</h1>
<form id="loginForm" action="com/servlet/RegServlet" method="post">
<table>
<tr>
<th>用户名：<input type="text" name="username"></th>
</tr>
<tr>
<th>密码：<input type="password" name="password"></th>
</tr>
<th>性别：<input type="radio" name="gender" value="男">男
        <input type="radio" name="gender" value="女">女
</th>
</tr>
<tr>
<th><input type="submit" value="注册">
    <input type="reset" value="重置">
</th>
</tr>
</table>
</form>
</body>
</html>