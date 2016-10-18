package it.alfasoft.francesca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		PrintWriter writer=response.getWriter();
//		writer.println("Benvenuta " + username);
		
		String str="<table>"+"<thead>"+"<tr>"+"<th> Username </th>"+"<th> Password </th>"+"</tr>"+"</thead>"+"<tr>"+"<td> Francesca </td>"+
		"<td> 123 </td>"+"</tr>"+"<tr>"+"<td> Paperino </td>"+"<td> 468 </td>"+"</tr>"+"</table>";
		
		writer.println(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
