import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class NameColour extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        String name = req.getParameter("name");
        String color = req.getParameter("color");
        Cookie c1 = new Cookie("name", name);
        Cookie c2 = new Cookie("color", color);
        res.addCookie(c1);
        res.addCookie(c2);
        res.sendRedirect("WelcomeServlet");
    }
}