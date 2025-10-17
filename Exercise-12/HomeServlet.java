//header.html
// <div style="background:lightgray;padding:10px">
//   <a href="home.html">Home</a> | 
//   <a href="about.html">About</a> 
// </div>

//footer.html
// <div style="background:lightgray;padding:10px">
//   <p>&copy; 2025 MySite</p>
// </div>


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        RequestDispatcher rd = req.getRequestDispatcher("Header.html");
        rd.include(req, res);
        res.getWriter().println("<h2>Welcome to Home Page</h2>");
        rd = req.getRequestDispatcher("Footer.html");
        rd.include(req, res);
    }
}