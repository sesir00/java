package databaseconnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

     public static final String DB_URL = "jdbc:mysql://localhost/nccs";
    public static final String user = "root" ;  
    public static final String password="1234";
    public static void main(String[] args) {
        Connection conn=null;
        Statement s=null;
       try{
        conn= DriverManager.getConnection(DB_URL, user, password);
        s=conn.createStatement();
        
        String sql = "CREATE TABLE user (id INTEGER primary key , name varchar (20) , address varchar(20))";
        s.executeUpdate(sql);
        s.close();
        conn.close();
        
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }

    public static void insertData(){
        Connection con= null;
        Statement stmt= null;
        try {
            String sql="Insert INTO user VALUES(1,'Ram','ktm')";
            String DB_URL = "jdbc:"
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
   
    
        
    } 

