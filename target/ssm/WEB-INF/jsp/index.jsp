<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/3/29
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty  user}">
    欢迎你 ....  ${user.user_name}
</c:if>
<c:if test="${empty  user}">
    你好  请登陆
</c:if>
</body>
</html>
