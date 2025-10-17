import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class MainServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>News Portal</h1>");
        RequestDispatcher rd = req.getRequestDispatcher("LatestServlet");
        rd.include(req, res);
        rd = req.getRequestDispatcher("SportsServlet");
        rd.include(req, res);
        rd = req.getRequestDispatcher("TechServlet");
        rd.include(req, res);
    }
}