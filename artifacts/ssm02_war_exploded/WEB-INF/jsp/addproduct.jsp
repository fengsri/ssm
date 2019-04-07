<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/4/5
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/product/add" method="post">
    <table bgcolor="#7fffd4" border="1">
        <tr>
            <td>商品名：</td>
            <td><input type="text" name="product_name"></td>
        </tr>
        <tr>
            <td>商品图片：</td>
            <td><input type="text" name="product_pic"></td>
        </tr>
        <tr>
            <td>商品描述：</td>
            <td><input type="text" name="product_dis"></td>
        </tr>
        <tr><td colspan="2"><input type="submit" value="添加"></td></tr>
    </table>
</form>
</body>
</html>
