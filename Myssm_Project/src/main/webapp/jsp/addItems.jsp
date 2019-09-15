<%--
  Created by IntelliJ IDEA.
  User: 比特科技
  Date: 2019/6/29
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>AddPage</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>
<body>
    <form action="../addItemsOperator.action" method="post">
        商品名字 : &nbsp;<input type="text" name="itemsName"/><br>
        商品价格: &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="itemsPrice"/><br>
        生产日期: &nbsp;<input type="text" name="itemsTime"/><br>
        商品描述: &nbsp;&nbsp;&nbsp;&nbsp;<input name="itemsInfo" /><br>
        <input type="submit" value="AddOperator">
        <input type="reset" value="Reset">
    </form>
</body>
</html>
