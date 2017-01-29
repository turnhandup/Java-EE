package ann;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ann.Authentication
 */
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Authentication() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String userName="admin";
	    String passwrd="123456";
	   

	    if(userName.equals(request.getParameter("name")) &&
				passwrd.equals(request.getParameter("passwrd"))){
	    	
	 	       out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('Hey,admin,nice to meet ya!');");
	    	   out.println("location='index.jsp';");
	    	   out.println("</script>");
	    	 
	    }  
	    else{
	    	   out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('Sorry,you have entered wrong username or password');");
	    	   out.println("location='index.jsp';");
	    	   out.println("</script>");
	    }

	}

}
