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
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    Cookie ck[]=request.getCookies();  
		    Cookie ck1[]=request.getCookies();  
		    
		    for(int i=0;i<ck.length;i++){  
		    	 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
		    	} 
	        out.close();  
	         
		    for(int i=0;i<ck1.length;i++){  
	    	    out.print("<br>"+ck1[i].getName()+" "+ck1[i].getValue());//printing name and value of cookie  
	    	 } 
            out.close();  
             }
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}

}
