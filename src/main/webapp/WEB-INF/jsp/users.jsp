<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>获取全部用户信息</title>
</head>
<body>
<table border="1">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th colspan="2">操作</th>
    </tr>
    <c:forEach var="user" items="${requestScope.users }">
        <tr>
            <td>${user.id }</td>
            <td>${user.name }</td>
            <td>${user.password }</td>
            <td><a href="/ssm/user/${user.id }">修改</a></td>
            <td>
                <form action="/ssm/user/${user.id }" method="post">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="删除">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/ssm/addUserView">添加员工</a>

</body>
</html>
