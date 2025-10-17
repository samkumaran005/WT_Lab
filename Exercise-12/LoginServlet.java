import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if(user.equals("admin") && pass.equals("123")) {
            res.sendRedirect("welcome.html"); //<h2>Welcome! Login successful.</h2>
        } else {
            res.sendRedirect("error.html"); //<h2>Invalid credentials. Try again.</h2>
        }
    }
}