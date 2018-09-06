package AttributePackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NextServlet
 */
@WebServlet("/NextServlet")
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String msg1=(String)request.getAttribute("RMSG");
	
	ServletContext ctx=this.getServletContext();
	String msg2=(String)ctx.getAttribute("CMSG");
	
	HttpSession session=request.getSession();
	String msg3=(String)session.getAttribute("SMSG");
	
	PrintWriter pw=response.getWriter();
	pw.write("Hello from NextSrvlet");
	pw.write("<br>");
	pw.write(msg1);
	pw.write("<br>");
	pw.write(msg2);
	}

}
