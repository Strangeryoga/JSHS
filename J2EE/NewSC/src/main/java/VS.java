import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/killer")
public class VS extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("un");
		String pass=req.getParameter("pss");
		
		if(pass.equals("Tom")&&name.equals("Tom")) {
			RequestDispatcher rd=req.getRequestDispatcher("wl");
			rd.forward(req, resp);
			
		}else {
			PrintWriter out=resp.getWriter();
			out.print("<h1>Sorry username and password is incorrect");
			RequestDispatcher rd=req.getRequestDispatcher("login1.html");
			rd.include(req, resp);
			
		}
	}

}
