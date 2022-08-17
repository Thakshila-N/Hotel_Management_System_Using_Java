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
public class AddRooms {
    
    
    
    
  //  Statement stmt;
    
  //  public void 
    
     Statement stmt;
    
    public void Rooms(String date, String month, String year, String dated, String monthd, String yeard, String room, String adult, String chil){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO room VALUES ('"+date+"', '"+month+"', '"+year+"', '"+dated+"', '"+monthd+"', '"+yeard+"', '"+room+"', '"+adult+"', '"+chil+"' )");
            
        }catch(Exception e){
            
          e.printStackTrace(); 
           
                                 
       }
   }

   
}
