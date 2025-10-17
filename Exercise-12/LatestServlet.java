import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class LatestServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.getWriter().println("<h3>Latest News</h3><p>Breaking news here...</p>");
    }
}