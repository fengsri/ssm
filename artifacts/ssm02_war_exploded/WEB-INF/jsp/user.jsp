<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/4/5
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>this is user manager</title>
</head>
<body>
<table bgcolor="#7fffd4" border="1">
    <tr>
        <td>user_id</td>
        <td>user_name</td>
        <td>user_password</td>
        <td>修改</td>
        <td>删除</td>
        <td>添加</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.user_id}</td>
            <td>${user.user_name}</td>
            <td>${user.user_password}</td>
            <td><a href="${pageContext.request.contextPath }/guan/tomotifi?user_id=${user.user_id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath }/guan/delete?user_id=${user.user_id}">删除</a></td>
            <td><a href="${pageContext.request.contextPath }/guan/toadd">添加</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath }/guan/toindex">首页</a>
</body>
</html>
