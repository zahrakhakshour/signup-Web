package ir.maktabsharif.hw10.servlet;

import ir.maktabsharif.hw10.dto.request.CreateUserRequest;
import ir.maktabsharif.hw10.model.User;
import ir.maktabsharif.hw10.service.UserService;
import ir.maktabsharif.hw10.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

public class UserServletLogin extends HttpServlet {
    private final UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        CreateUserRequest createUserRequest = CreateUserRequest.builder().userName(username).password(password).build();
        Optional<User> optionalUser = userService.getUserByUsernameAndPassword(createUserRequest);
        req.setAttribute("userResponseLogin", optionalUser);
        if (optionalUser.isPresent()) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            Cookie cookie = new Cookie("username", "login");
            resp.addCookie(cookie);
            req.getRequestDispatcher("/view/home.jsp").forward(req, resp);
        }

    }
}
