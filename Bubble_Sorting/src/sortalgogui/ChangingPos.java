/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgogui;

import javax.swing.JButton;

/**
 *
 * @author User
 */
public class ChangingPos {
    
    public void myF(JButton btn1) throws InterruptedException{
        
        for (int i = 0; i < 1000; i++) {
            
            btn1.setBounds(btn1.getX()+1, i, 84, 64);
            Thread.sleep(1000);
           
        }
        
    }
    
}
 