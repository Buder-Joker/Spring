<%@ page import="com.ming.po.User" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/14
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>查询所得</title>
</head>
<body>
********User对象在这里哦***********

<%--<table border="1" align="center" width="90%">
    <tr>
        <th>UserID</th>
        <th>UserName</th>
        <th>UserBirthday</th>
        <th>UserSex</th>
        <th>UserAddr</th>
    </tr>
    <c:forEach items="${userListKey}" var="users">
        <tr>
            <td>${User.userId}</td>
            <td>${User.userName}</td>
            <td>${User.birthday}</td>
            <td>${User.userSex}</td>
            <td>${User.userAddr}</td>
        </tr>
    </c:forEach>
</table>--%>
<%--${User.userName}<br>
${User.birthday}<br>
${User.userSex}<br>
${User.userAddr}--%>

<%--<div align="center">
    &lt;%&ndash;<form action="" method="post">&ndash;%&gt;
        &lt;%&ndash;<%User user = (User)request.getAttribute("user"); %>&ndash;%&gt;
        &lt;%&ndash;id:<input type="hidden" name="id" value="${User.userId}"><br>&ndash;%&gt;
        userName:<input type="text" name="username" value="${User.userName}"><br>
        Birthday:<input type="text" name="birthday" value="${User.birthday}"><br>
        Sex:<input type="text" name="sex" value="${User.userSex}"><br>
        Address:<input type="text" name="address" value="${User.userAddr}"><br>
    &lt;%&ndash;</form>&ndash;%&gt;
</div>--%>

</body>
</html>
