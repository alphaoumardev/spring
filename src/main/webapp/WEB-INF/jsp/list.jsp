<%--
  Created by IntelliJ IDEA.
  User: Alpha Oumar Diallo
  Date: 6/2/2021
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>employee list</title>
</head>
<body>
<h1>The list of the employee which the spring mvc</h1>
    <div>
        <table border="1">
            <tr>
                <th>full Name </th>
                <th>Email</th>
                <th>Gender</th>
                <th>Hobbies</th>
                <th>Country</th>
                <th>Address</th>
            </tr>
<%--            <jsp:useBean id="list" scope="request" type="java.util.List"/>--%>
            <c:forEach items="${list}" var="e">
                <tr>
                    <td>${e.fullName}</td>
                    <td>${e.email}</td>
                    <td>${e.gender}</td>
                    <td>${e.hobbies}</td>
                    <td>${e.country}</td>
                    <td>${e.address}</td>
                </tr>

            </c:forEach>
        </table>
    </div>
</body>
</html>
