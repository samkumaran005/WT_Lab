import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class QuizServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String ans1 = req.getParameter("q1");
        int score = 0;
        if("4".equals(ans1)) score++;

        out.println("<h2>Your Score: " + score + "</h2>");
    }
}