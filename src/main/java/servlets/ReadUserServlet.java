package servlets;

import dao.UserDAO;
import dao.UserLinkedListDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;

@WebServlet("/users/read")
public class ReadUserServlet extends HttpServlet {
    private UserDAO userDAO;
    private User user;

    @Override
    public void init() throws ServletException {
        userDAO = UserLinkedListDAO.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user = userDAO.read(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("user", user);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/read-user.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
