import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class AddUserServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Users(name,email) VALUES(?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();
            out.println("User added successfully!");
            con.close();
        } catch(Exception e) {
            out.println("Error: " + e);
        }
    }
}

//CREATE DATABASE testdb;
// USE testdb;
// CREATE TABLE Users (
//     id INT AUTO_INCREMENT PRIMARY KEY,
//     name VARCHAR(50),
//     email VARCHAR(50)
// );
