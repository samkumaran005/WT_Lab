package productinventory;
import java.sql.*;
public class ProductInventory {
    
    String url="jdbc:mysql://localhost:3306/details_db";
    String username="root";
    String password="#Kumaran005";  
    Connection getConnection() throws SQLException{ 
        return DriverManager.getConnection(url,username,password);
    }
    
    public void addProduct(int prod_id,String name,double price,int qinstock) throws SQLException{
        Connection conn=getConnection();
        String sql="insert into products(prod_id,name,price,qinstock) values(?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1,prod_id);
        ps.setString(2,name);
        ps.setDouble(3,price);
        ps.setInt(4,qinstock);
        ps.executeUpdate();
    }
    
    public void updateProduct(int prod_id,String newname,double newprice,int newqinstock) throws SQLException{
        Connection conn=getConnection();
        String sql="Update products set name=?,price=?,qinstock=? where prod_id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,newname);
        ps.setDouble(2,newprice);
        ps.setInt(3,newqinstock);
        ps.setInt(4,prod_id);
        ps.executeUpdate();
    }
    
    public void viewProducts() throws SQLException{
        Connection conn=getConnection();
        String sql="Select * from products";
        Statement stmt = conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.print(rs.getString(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.print(rs.getString(4)+"\t");
            System.out.println("\n");
        }    
    }
    
    public void deleteProduct(int prod_id){
        String sql = "DELETE FROM products WHERE prod_id = ?";
        try(Connection conn=getConnection();PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,prod_id);
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
        ProductInventory pi = new ProductInventory();
        pi.addProduct(3,"keyboard",1500.00,8);
        pi.viewProducts();
        pi.updateProduct(2,"mouse",800.00,8);
        pi.deleteProduct(2);
        pi.close();
        
    }  
}
