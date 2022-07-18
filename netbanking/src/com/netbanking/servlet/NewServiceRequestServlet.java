package com.netbanking.servlet;

import java.io.IOException;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/newServiceRequest"})
public class NewServiceRequestServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SecureRandom random = new SecureRandom();

        String accountNo = request.getParameter("accountNo");
        String requestType = request.getParameter("requestType");
        String accountHolderName = request.getParameter("accountHolderName");
        String mobileNo = request.getParameter("mobileNo");
        String emailAddress = request.getParameter("emailAddress");

        // store the service request details into database

        int referenceNo = random.nextInt(31647);
        request.setAttribute("requestType", requestType);
        request.setAttribute("referenceNo", referenceNo);
        request.getRequestDispatcher("/service-request-details.jsp").forward(request, response);
    }
}