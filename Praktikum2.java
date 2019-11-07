/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import javax.swing.*;

public class Praktikum2 {
    
    public static void main(String[] args){
        
        JFrame f = new JFrame ("title");
                 JPanel p = new JPanel();
                 JButton b = new JButton ("press me");
                 
                         f.setSize(400, 400);
                         
                         f.add(b);
                         f.setContentPane(p);
                         
                         f.show();
    }
    
}
    

