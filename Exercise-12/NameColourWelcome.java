import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class NameColourWelcome extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = "Guest", color = "white";
        Cookie[] cookies = req.getCookies();
        if(cookies != null) {
            for(Cookie c : cookies) {
                if(c.getName().equals("name")) name = c.getValue();
                if(c.getName().equals("color")) color = c.getValue();
            }
        }
        out.println("<body style='background-color:"+color+"'>");
        out.println("<h2>Welcome back, " + name + "!</h2>");
        out.println("</body>");
    }
}