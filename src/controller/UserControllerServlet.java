package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;

public class UserControllerServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String una = request.getParameter("userName");
        String pwd = request.getParameter("password1");
        String ema = request.getParameter("email");
        String phn = request.getParameter("phone");
        String sty = request.getParameter("village");
 
        HttpSession session = request.getSession(true);
        try {
           
        	
        	UserDAO userDAO = new UserDAO();
        	userDAO.addUserDetails(una, pwd, ema, phn, sty);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }

}
