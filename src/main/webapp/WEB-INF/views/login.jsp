<%@ page contentType="text/html;charset=GBK" pageEncoding="GBK" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp" %>
    <title>登录</title>
</head>
<body>
<form action="test2/viewAll" method="post">
    用户名<input type="text" name="name" id="name"><br/>
    密 码<input type="password" name="pwd" id="pwd"><br/>
    <input type="submit" name="登录">
</form>
</body>
</html>