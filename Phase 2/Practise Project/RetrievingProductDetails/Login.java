import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		PrintWriter out = response.getWriter();
		 String p_ID = request.getParameter("p_ID");
		 out.print("<h1>Displaying the Product Details...</h1>");
		  out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>Product Price</th></tr>");

		  try {
		       Class.forName("com.mysql.cj.jdbc.Driver");
		       Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","");
		       java.sql.Statement stmt=dbCon.createStatement();
		 
		       
		       ResultSet rs =stmt.executeQuery("select * from product where p_ID="+p_ID+"");
		       
		       while(rs.next()) {
		        
		        out.print("<tr><td>");
		        out.println(rs.getInt(1));
		        out.print("</td>");
		        out.print("<td>");
		        out.print(rs.getString(2));
		        out.print("</td>");
		        out.print("<td>");
		        out.print(rs.getInt(3));
		        out.print("</td>");
		        out.print("</tr>");   
		   }
		       
		  }
		  catch(Exception e){
		   
		   System.out.println("Some Issue : "+ e.getMessage());
		  }
		  
		  out.print("</table>");
		  
		 }
		
	}

