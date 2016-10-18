package it.alfasoft.francesca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(urlPatterns = { "/ServletRedirect" })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password"); 
		
		
		if(password.equals("123")){

//			response.sendRedirect("benvenuto.html");
			PrintWriter writer=response.getWriter();
			writer.println("Password corretta!"+"<br>");
			RequestDispatcher rds= request.getRequestDispatcher("Servlet2");
			rds.include(request, response);
			
		}else{
			RequestDispatcher rds= request.getRequestDispatcher("login.html");
//			response.sendRedirect("login.html");
			PrintWriter writer=response.getWriter();
			writer.println("Username o password errata");
			rds.include(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		PrintWriter writer=response.getWriter();
		if(password.equals("123")){
			response.sendRedirect("benvenuto.html");;
		}else{
			response.sendRedirect("login.html");
		}
	}

}
