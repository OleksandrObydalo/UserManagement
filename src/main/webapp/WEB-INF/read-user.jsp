<%@ page import="model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>
<%
    User user = (User)request.getAttribute("user");
%>
<%@ include file="header.html"%>
<br><br>
<%@ include file="header.html"%>
<form action="/users/update" method="post">
    <p> ID: <%=user.getId()%></p>
    <p> Name: <%=user.getName()%></p>
    <p> Password: <%=user.getPassword()%></p>
</form>
</body>
</html>
