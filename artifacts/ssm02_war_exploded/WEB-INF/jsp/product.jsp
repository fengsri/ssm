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
    <title>this is product manager</title>
</head>
<body>
<table bgcolor="#7fffd4" border="1">
    <tr>
        <td>product_id</td>
        <td>product_name</td>
        <td>product_pic</td>
        <td>product_dis</td>
        <td>修改</td>
        <td>删除</td>
        <td>添加</td>
    </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.product_id}</td>
            <td>${product.product_name}</td>
            <td>${product.product_pic}</td>
            <td>${product.product_dis}</td>
            <td><a href="${pageContext.request.contextPath }/product/tomotifi?product_id=${product.product_id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath }/product/delete?product_id=${product.product_id}">删除</a></td>
            <td><a href="${pageContext.request.contextPath }/product/toadd">添加</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath }/product/toindex">首页</a>

</body>
</html>
