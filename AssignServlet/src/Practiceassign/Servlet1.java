package Practiceassign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("user");
		    String b=request.getParameter("password");  
		    out.print("Welcome "+ n);  
		  
		    Cookie ck=new Cookie("user",n);
		    Cookie ck1=new Cookie("password",b);	                                       //creating cookie object  
		    response.addCookie(ck);	
		    response.addCookie(ck1);//adding cookie in the response  
		  
		    //creating submit button  
		    out.print("<form action='Servlet2'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		   
		
	}

}
