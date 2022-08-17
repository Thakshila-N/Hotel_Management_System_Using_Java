/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author Thakshila
 */
public class AddFeedback {
    Statement stmt;
    
    public void Feedback1(String name, String email, String feedback){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO feedback VALUES ('"+name+"',  '"+email+"', '"+feedback+"' )");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
