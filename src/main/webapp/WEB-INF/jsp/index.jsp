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
<c:if test="${not empty  loginUser}">
    欢迎你 ....  ${loginUser.user_name}<br>
    <a href="${pageContext.request.contextPath }/guan/all">用户管理</a><br>
    <a href="${pageContext.request.contextPath }/product/all">商品管理</a><br>
</c:if>
<c:if test="${empty  loginUser}">
    你好  请登陆
</c:if>
<br>
<table bgcolor="aqua" border="1">
    <tr>
        <td>product_id</td>
        <td>product_name</td>
        <td>product_pic</td>
        <td>product_dis</td>
    </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.product_id}</td>
            <td>${product.product_name}</td>
            <td>${product.product_pic}</td>
            <td>${product.product_dis}</td>
        </tr>
    </c:forEach>
</table>
<br>
<%--<input type="text" id="product_like"><button id="productsearch" onclick="">搜索</button>--%>

<form method="post" action="${pageContext.request.contextPath }/product/search">
    商品搜索:<input type="text" name="product_like"><br>
    <input type="submit" value="搜索">
</form>
<%--<script>
    var text = document.getElementById("product_like");
    function search() {
        var product_like = text.innerText;
    }
</script>--%>
</body>
</html>
