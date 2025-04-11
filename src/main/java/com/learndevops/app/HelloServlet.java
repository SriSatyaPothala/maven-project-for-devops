package com.learndevops.app;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final String MESSAGE =
        "Hello! This app is deployed using AWS CI/CD<br>" +
        "🎉 Congratulations, deployment was successful!";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().write("<html><body><h2>" + MESSAGE + "</h2></body></html>");
    }
}
