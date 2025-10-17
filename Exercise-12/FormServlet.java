import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        out.println("<h2>Submitted Data</h2>");
        out.println("Name: " + name + "<br>Email: " + email);
    }
}