<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="/ssm/addUser" method="post">
    用户名：<input type="text" name="name"><br><br>
    密 码：<input type="text" name="password"><br><br>
    <input type="submit" value="提交">
</form>
</body>
</html>