import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Emailid=request.getParameter("Emailid");
		String Password = request.getParameter("Password");
		
		RequestDispatcher rd = null;
		if(Emailid.equalsIgnoreCase("vincy@gmail.com")&& Password.equals("12345"))
		{
			rd=request.getRequestDispatcher("Dashboardpage");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("Errorpage");
			rd.forward(request, response);
		}
	}

}
