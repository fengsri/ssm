<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/3/29
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
注册<br/>
<form method="post" action="${pageContext.request.contextPath}/user/regist">
    用户名：<input type="text" name="user_name"><br/>
    密码：<input type="password" name="user_password"><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
