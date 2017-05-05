package servlet_pages;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeedao;
import pojos.employee;


	@WebServlet("/RegistrationServlet")
	
	public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
	    super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try{
	    	employeedao dao = new employeedao();
	        System.out.println("In the registration Servlet");
	      employee em=new employee();
	      	em.setUsername(request.getParameter("username"));
	      	em.setPwd(request.getParameter("pwd"));
	      	em.setEmail(request.getParameter("email"));
	      	dao.registerEmployee(em);
	        //response.sendRedirect("welcome.jsp");        
	    } catch (Throwable exc)
	    {
	        System.out.println(exc);
	    }
	
	

	}
	}