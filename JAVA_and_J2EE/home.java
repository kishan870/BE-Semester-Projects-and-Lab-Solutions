import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		//RequestDispatcher rd=request.getRequestDispatcher("music.html");
		//rd.forward(request, response);
		String s1=null;
		String s2=null;
		
			String url = "jdbc:mysql://localhost:3306/"; 
		   String dbName = "music"; 
		   String driver = "com.mysql.jdbc.Driver"; 
		   String user = "root";  
		   String password = ""; 
		   try{
			   String s=null;
				s=request.getParameter("name");
			   Class.forName(driver).newInstance();
			   Connection con=DriverManager.getConnection(url+dbName,user,password);
			   String q1="SELECT * FROM songs WHERE name = ?";
			   PreparedStatement smt=con.prepareStatement(q1);
			   smt.setString(1, s);
			   ResultSet rs=smt.executeQuery();
			   while(rs.next())
			   {
				  s1=rs.getString("link");
				  s2=rs.getString("cover art");
			   }
		   }
		   
		   catch(Exception e){
			   System.out.println(e);
		   }
		   out.println("<!DOCTYPE html>");
	 	   out.println("<html><head>");
	 	   out.println("<title>MUSIC</title>");
	 	   out.println("<style>");
	 	   out.println("body{background-color:rgb(194, 194, 163,0.5);}");
	 	   out.println("img{position:absolute;left:450px;top:120px;z-index:-1;width:680px;height:550px;}");
	 	   //out.println(".aud1{ height: 370px;border: no border; text-align: center; position: relative;");
	 	   out.println("audio{position:absolute;top:90%;left:32.5%;}");
	 	   out.println("</style></head><body>");
	 	   out.println("<div>");
	 	   out.println("<img src="+s2+"height=150>");
	 	   out.println("</div>");
	 	   //out.println("<div class=\"aud1\">");
	 	  //out.println("<div class=\"aud2\">");
	 	   
	 	   out.println("<audio controls style=\"width:600px\"autoplay>");
	 	   	//out.println("<source src=\"C:\\Users\\Ashwin B srivatsa\\Desktop\\06-linkin_park-what_ive_done-.mp3\" type=\"audio/mpeg\">");
	 	   out.println("<source src="+s1+"type=\"audio/mpeg\">");
	 	   
	 	   out.println("</audio></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
