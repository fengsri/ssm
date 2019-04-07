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
<form action="${pageContext.request.contextPath }/product/motifi" method="post">
    <table border="1" bgcolor="#7fffd4">
        <tr>
            <td>商品id</td>
            <td>商品名</td>
            <td>商品图片</td>
            <td>商品描述</td>
        </tr>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td><input type="text" name="product_id" value="${product.product_id}"></td>
                <td><input type="text" name="product_name" value="${product.product_name}"></td>
                <td><input type="text" name="product_pic" value="${product.product_pic}"></td>
                <td><input type="text" name="product_dis" value="${product.product_dis}"></td>
            </tr>
        </c:forEach>
    </table>
</form>
<a href="${pageContext.request.contextPath }/product/toindex">返回</a>
</body>
</html>
