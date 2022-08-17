/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection; // to connect Java Application with mysql database
import java.sql.Statement; // to execte queries queries with the database
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Thakshila
 */
public class DBConnection {
    
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
        try{ 
        //Estalish the connection
        String url = "jdbc:mysql://localhost:3306/dbintake7";
        conn = DriverManager.getConnection(url, "root", "");
        
       //create the connection
       stat = conn.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
       
       return stat;
       
       }
    
    //Close the connection
    public static void closeCon() throws SQLException {
    conn.close();
}

    
}
