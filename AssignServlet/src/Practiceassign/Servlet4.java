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
 * Servlet implementation class Servlet4
 */
@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		  try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();
		     
		      HttpSession session=request.getSession(false);
		      
		      String myName=(String)session.getAttribute("username");
		      String myage=(String)session.getAttribute("age");
		      String myemail=(String)session.getAttribute("email");
		      String mycity=(String)session.getAttribute("city");
		      String mygender=(String)session.getAttribute("gender");
		      
		      
		      pwriter.println("session creation time" + session.getCreationTime()+"%n");
		      pwriter.println("session last accessed time" +session.getLastAccessedTime()+"%n");
		      pwriter.println("session max interval time" +session.getMaxInactiveInterval()+"%n");
		      pwriter.println("session servelt context" +session.getServletContext()+"%n");
		      pwriter.println("session servelt context" +session.getId()+"%n");
		      pwriter.println(session.isNew());
		      
		      pwriter.print("Name: "+myName+" Age: "+myage+" Email: "+myemail+" City: "+mycity+" Gender: "+mygender);
		      pwriter.close();
		  }catch(Exception exp){
		      System.out.println(exp);
		   }
		  }
		}