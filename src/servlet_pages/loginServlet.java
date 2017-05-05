package servlet_pages;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeedao;

/**
 * Servlet implementation class loginServlet1
 */
//@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   /* @Override
    public void init()
    {
    	
    System.out.println("in init");
    }*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		employeedao dao = null;
		String uname=request.getParameter("Username");
		String pwd=request.getParameter("Password");
		try {
			String result=dao.validateUser(uname, pwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
