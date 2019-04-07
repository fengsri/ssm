
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    登陆：<br/>
    <form action="${pageContext.request.contextPath }/user/userlogin" method="post">
        用户名：<input type="text" name="user_name"><br/>
        密码：<input type="password" name="user_password"><br/>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
