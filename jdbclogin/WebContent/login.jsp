<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>用户登录</h1>
<!-- 相对路径 action 前面不加/ 如果加了，就是指服务器根目录 -->
<!-- 绝对路径 项目的根目录request.getContextPath()/com/servlet/LoginServlet -->
<form id="loginForm" action="com/servlet/LoginServlet" method="post">
<table>
<tr>
<th>用户名：<input type="text" name="username"></th>
</tr>
<tr>
<th>密码：<input type="password" name="password"></th>
</tr>
<tr>
<th><input type="submit" name="submit" value="登录">
    <a href="reg.jsp">新用户注册</a>
</th>
</tr>

</table>
</form>
</body>
</html>