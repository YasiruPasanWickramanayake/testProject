package Database;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtils {
    private static String url="jdbc:mysql://localhost:3306/testjavaee";
    private static String user="root";
    private static String password="";
    public static PreparedStatement getPreparedStatement(String sql){
        PreparedStatement ps=null;
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
            ps=con.prepareStatement(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ps;
    }
   
}
