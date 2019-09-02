<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="/ssm/user" method="post">
    <input type="hidden" name="_method" value="PUT">
    <table border="1">
        <tr>
            <th>编号</th>
            <td><input type="text" name="id"
                       value="${requestScope.user.id }"></td>
        </tr>
        <tr>
            <th>用户名</th>
            <td><input type="text" name="name"
                       value="${requestScope.user.name }"></td>
        </tr>
        <tr>
            <th>密码</th>
            <td><input type="text" name="password"
                       value="${requestScope.user.password }"></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改"></td>
        </tr>
    </table>
</form>
</body>
</html>