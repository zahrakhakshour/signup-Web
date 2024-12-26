package ir.maktabsharif.hw10.servlet;

import ir.maktabsharif.hw10.dto.request.CreateUserRequest;
import ir.maktabsharif.hw10.dto.response.CreateUserResponse;
import ir.maktabsharif.hw10.service.UserService;
import ir.maktabsharif.hw10.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServletSignup extends HttpServlet {
    private final UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        CreateUserRequest createUserRequest = (CreateUserRequest) req.getAttribute("createUserRequest");
        CreateUserResponse userResponse = userService.createUser(createUserRequest);
        req.setAttribute("userResponse", userResponse);

        req.getRequestDispatcher("index.jsp").forward(req, resp);


    }
}
