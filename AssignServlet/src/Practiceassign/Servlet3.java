package Practiceassign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){
	try{
	      response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();

	      String name = request.getParameter("user");
	      String age = request.getParameter("age");
	      String email = request.getParameter("email");
	      String city = request.getParameter("city");
	      String gender = request.getParameter("gen");
	      
	      
	      
	      
	      pwriter.print("Welcome "+name+"%n");
	      pwriter.print("Your details are below "+"%n");
	      pwriter.print("Age: "+age+"%n");
	      pwriter.print("City: "+city+"%n");
	      pwriter.print("Gender: "+gender+"%n");
	      pwriter.print("Email "+email+"%n");
	      
	      
	      
	      
	      //creating the HttpSession below
	      HttpSession session=request.getSession(); 
	      
	      session.setAttribute("username",name);
	      session.setAttribute("age",age);
	      session.setAttribute("email",email);
	      session.setAttribute("city",city);
	      session.setAttribute("gender",gender);
	      
	     
	      
	      pwriter.print("<form action='Servlet4'>");  
	      pwriter.print("<input type='submit' value='go'>");  
	      pwriter.print("</form>");  
		    pwriter.close();
	    }catch(Exception exp){
	       System.out.println(exp);
	     }
	  }
	}