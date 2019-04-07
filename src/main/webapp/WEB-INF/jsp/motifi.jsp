<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/4/5
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息修改</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/guan/motifi" method="post">
    <table border="1" bgcolor="#7fffd4">
        <tr>
            <td>用户id</td>
            <td>用户姓名</td>
            <td>用户密码</td>
        </tr>
        <tr>
            <td><input type="text" name="user_id" value="${user.user_id}"></td>
            <td><input type="text" name="user_name" value="${user.user_name}"></td>
            <td><input type="text" name="user_password" value="${user.user_password}"></td>
        </tr>
        <tr><td colspan="3"><input type="submit" value="修改"></td></tr>
    </table>
</form>
<a href="${pageContext.request.contextPath }/guan/all">返回</a>
</body>
</html>
