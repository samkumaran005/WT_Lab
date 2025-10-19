//import libraries
import java.sql.*;
import java.util.*;
public class JDBCExample {
    //Register jdbc driver
    //Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/details_db";
    String username="root";
    String password="#Kumaran005";  
    //Create Connection
    Connection getConnection() throws SQLException{ 
        return DriverManager.getConnection(url,username,password);
    }
    
    public void addUser(int id,String name,String dept)throws SQLException{
        Connection conn=getConnection();
        String sql="insert into user(id,name,dept) values(?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2,name);
        ps.setString(3,dept);
        ps.executeUpdate();   
    }
    
    public void getUser() throws SQLException{
        Connection conn=getConnection();
        String sql="Select * from user";
        Statement stmt = conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.print(rs.getString(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.println("\n");
        }    
    }
    
    public void getUserByName(String name) throws SQLException{//(int id)
        Connection conn=getConnection();
        String sql="Select * from user where name=?";//id=?
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,name);//(1,id)
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            System.out.print("ID:"+rs.getString(1)+"\t");
            System.out.print("Name:"+rs.getString(2)+"\t");
            System.out.print("Dept:"+rs.getString(3)+"\n");   
        }
        else{
            System.out.println("User Not Found");
        }
    }
    
    public void updateUser(int id,String newname,String newdept) throws SQLException{
        Connection conn=getConnection();
        String sql="Update user set name=?,dept=? where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,newname);
        ps.setString(2,newdept);
        ps.setInt(3,id);
        ps.executeUpdate();
    }
    
    public void deleteUser(int id){
        String sql = "DELETE FROM User WHERE id = ?";
        try(Connection conn=getConnection();PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.print(e);
        }       
    }
    
    public void close() throws SQLException {
        Connection conn=getConnection();
        if (conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        JDBCExample jdbc=new JDBCExample();
        jdbc.addUser(4,"vijesh","Mech");
        jdbc.getUser();
        jdbc.getUserByName("Gnan");
        //jdbc.getUserById(3);
        jdbc.updateUser(2, "jothi", "IT");
        jdbc.deleteUser(4);
        jdbc.close();
}

}

