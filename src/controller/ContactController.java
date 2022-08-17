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
public class ContactController {
    
    
    public static void ContactUs(String name, String cnumber, String email, String subject, String message){
        
        new model.AddContact().ContactUs(name, cnumber, email, subject, message);
        
        JOptionPane.showMessageDialog(null, "We received your Message ", "Thank You...", JOptionPane.INFORMATION_MESSAGE);
        
    
    }
    
    
}
