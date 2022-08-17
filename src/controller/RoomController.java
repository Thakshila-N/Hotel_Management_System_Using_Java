/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Thakshila
 */
public class RoomController {
     public static void Rooms(String date, String month, String year, String dated, String monthd, String yeard, String room, String adult, String chil){
         
        new model.AddRooms().Rooms(date, month, year, dated, monthd, yeard, room, adult, chil);
        
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
}
}