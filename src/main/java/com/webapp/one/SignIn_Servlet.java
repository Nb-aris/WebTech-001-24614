package com.webapp.one;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/SignIn_Servlet")
public class SignIn_Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String email = request.getParameter("email");
    String password = request.getParameter("password");

        HttpSession session = request.getSession(false);
        if(session != null){
        String StoredEmail = (String) session.getAttribute("email");
        String StoredPassword = (String) session.getAttribute("password");
        if(email.equals(StoredEmail) && password.equals(StoredPassword) ){
            response.sendRedirect("Admission.jsp");
            return;
        }
        }
        response.sendRedirect("signin.jsp");
    }
}
