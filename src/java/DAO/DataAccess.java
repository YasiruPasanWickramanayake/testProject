package DAO;

import model.News;
import Database.DBUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataAccess {
     
    public void addnew(News n){
        
        try {
            String sqlCommand="insert into news values(?,?,?,?,?,?)";
            PreparedStatement ps=DBUtils.getPreparedStatement(sqlCommand);
            ps.setString(1,n.getTitle());
            ps.setString(2,n.getDate());
            ps.setString(3,n.getDescription());
            ps.setString(4,n.getDetails());
            ps.setString(5,n.getCatagory());
            ps.setString(6,n.getImage());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<News> getAll(){
       String sqlCommand="select * from news";
       List<News> ls=new LinkedList<>();
        try {
            ResultSet rs=DBUtils.getPreparedStatement(sqlCommand).executeQuery();
            while(rs.next()){
                News n=new News(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                ls.add(n);
            }
        } catch (Exception e) {
        }
        return ls;
    }
}
