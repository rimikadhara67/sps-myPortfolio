package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    
    // Get the value entered in the form.
    String clientName = request.getParameter("clientName");
    String clientEmail = request.getParameter("clientEmail");
    String clientInput = request.getParameter("clientInput");

    // Print the value so you can see it in the server logs.
    System.out.println(clientName + " [" + clientEmail + "] : " + clientInput);

    // Write the value to the response so the user can see it.
    response.getWriter().println(clientName + "[" + clientEmail + "] :" + clientInput);

    // Redirecting the user to portfolio's homepage.
    response.sendRedirect("https://rdhara-sps-summer22.appspot.com");
  }
}