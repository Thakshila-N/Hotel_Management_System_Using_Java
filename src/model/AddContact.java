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
public class AddContact {
    
    
    Statement stmt;
    
    public void ContactUs(String name, String cnumber, String email, String subject, String message){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO contact VALUES ('"+name+"', '"+cnumber+"', '"+email+"', '"+subject+"', '"+message+"' )");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
   // Statement stmt;
    
   // public void Student(String name, String address, String gender, String age){
        
       // try{
      //      stmt = DBConnection.getStatementConnection();
       //     stmt.executeUpdate("INSERT INTO student VALUES ('"+name+"', '"+address+"', '"+gender+"', '"+age+"')");
            
       // }catch(Exception e){
            
          //  e.printStackTrace(); //printStackTrace = e is just a veriable. e stand for
                                 // exceptions, but you can rename it anything you like.
                                 // HOW EVER THE DATA TYPE HAS TO REMAIN  exception.
                                 // The printStackTrace methode is a tool used to handle exceptions and  errors.
                                 // This methode is very useful in diagnosing exceptions.
           
                                 
    //    }
   // }
   
    
}
