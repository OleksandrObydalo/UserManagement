<%@ page import="model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all Users</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Password</th>
        <th colspan="3">Operation</th>
    </tr>

    <%
        for (User user: (List<User>)request.getAttribute("users")){
       %>
    <tr>
        <td><%=user.getId()%></td>
        <td><%=user.getName()%></td>
        <td><%=user.getPassword()%></td>
        <td>
            <a href="/users/read?id=<%=user.getId()%>">Read</a>
        </td>
        <td>
            <a href="/users/update?id=<%=user.getId()%>">Update</a>
        </td>
        <td>
            <a href="/users/delete?id=<%=user.getId()%>">Delete</a>
        </td>
    </tr>
        <%}
    %>
</table>
</body>
</html>
