package data;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Success extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("This is Success Servlet");
        out.println("<h2>Successfully Registered</h2>");
        
        
    }
    
    
}
