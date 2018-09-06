package AttributePackage;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class AttributeServlet
 */
@WebServlet("/AttributeServlet")
public class AttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	request.setAttribute("RMSG","Message with request scope");
	ServletContext ctx=this.getServletContext();
	ctx.setAttribute("CMSG", "message with context scope");

	
	HttpSession session=request.getSession();
	session.setAttribute("Msg1", "message with session scope");
	
	javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("NextServlet");
	rd.forward(request, response);
	}

}
