<%--
  Created by IntelliJ IDEA.
  User: 林宝程
  Date: 2020/9/23
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询了所有的账户消息</h3>
    <table>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>地址</td>
            <td>电话</td>
        </tr>
        <tbody>
        <c:forEach items="${list}" var="employee">
            <tr>
                <td> ${employee.id}</td>
                <td> ${employee.name}</td>
                <td> ${employee.age}</td>
                <td> ${employee.sex}</td>
                <td> ${employee.address}</td>
                <td> ${employee.phone}</td>
                <td><a href="${pageContext.request.contextPath}/employee/delete?id=${employee.id}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</body>
</html>
