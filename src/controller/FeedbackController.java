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
public class FeedbackController {
    
    public static void Feedback1(String name, String email, String feedback){
        
        new model.AddFeedback().Feedback1(name,email, feedback);
        
        JOptionPane.showMessageDialog(null, "We received your Message ", "Thank You...", JOptionPane.INFORMATION_MESSAGE);
        
    
    }
}
