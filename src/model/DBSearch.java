/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/*DBSearch
 *
 * @author Thakshila
 */
public class DBSearch {
    Statement stmt;
    private ResultSet rs;
    
   public ResultSet searchLogin(String usName){
        try{
             stmt = DBConnection.getStatementConnection();
            String name = usName;
            
            
            //Execute the query
            rs = stmt.executeQuery("SELECT * FROM login WHERE username='" + name + "'" );
        }catch (Exception e){
            e.printStackTrace();
            
        }
        return rs;
    }
   
   
   //Display Message
   public ResultSet showContact(){  // method name
       
       try{
           
           stmt = DBConnection.getStatementConnection();
           rs = stmt.executeQuery("SELECT * FROM contact");          
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return rs;
   } 
   
   
    public ResultSet Room123(){  // method name
       
       try{
           
           stmt = DBConnection.getStatementConnection();
           rs = stmt.executeQuery("SELECT * FROM room ");          
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return rs;
   } 
    
    public ResultSet Room150(){  // method name
       
       try{
           
           stmt = DBConnection.getStatementConnection();
           rs = stmt.executeQuery("SELECT * FROM room ");          
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return rs;
   }
    
    
    public ResultSet Room185(){  // method name
       
       try{
           
           stmt = DBConnection.getStatementConnection();
           rs = stmt.executeQuery("SELECT * FROM room ");          
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return rs;
   }
    
     public ResultSet Feedback1(){  // method name
       
       try{
           
           stmt = DBConnection.getStatementConnection();
           rs = stmt.executeQuery("SELECT * FROM feedback ");          
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return rs;
   }
   
}
