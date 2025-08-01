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
    <form action="/users/update" method="post">
        <table>
            <tr>
                <td>
                    <label for="id">ID: </label>
                </td>
                <td>
                    <iput type="text" id="id" name="id" value="<%=user.getId()%>" disabled/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="username">Username:  </label>
                </td>
                <td>
                    <input type="text" id="username" name="username" value="<%=user.getName()%>">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="password">Password:  </label>
                </td>
                <td>
                    <input type="password" id="password" name="password" value="<%=user.getPassword()%>">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Update">
                </td>
                <td>
                    <input type="reset" value="Clear">
                </td>
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
        </table>
    </form>
</body>
</html>
