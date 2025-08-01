package servlets;

import dao.UserDAO;
import dao.UserLinkedListDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/users/create")
public class CreateUserServlet extends HttpServlet {

    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        userDAO = UserLinkedListDAO.getInstance();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Create new model.User</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <form action=\"/users/create\" method=\"post\">\n" +
                "        <table>\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <label for=\"username\">Username:  </label>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                    <input type=\"text\" id=\"username\" name=\"username\">\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <label for=\"password\">Password:  </label>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                    <input type=\"password\" id=\"password\" name=\"password\">\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <input type=\"submit\" value=\"Create\">\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                    <input type=\"reset\" value=\"Clear\">\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "            </tr>\n" +
                "        </table>\n" +
                "    </form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username, password);
        userDAO.create(user);
    }

}
