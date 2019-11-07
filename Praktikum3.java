/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ADRIAN H. SUWARDI
 */
public abstract class Praktikum3 implements ActionListener {

    private static void createAndShowGUI() {
    
    JFrame frame = new JFrame ("i am JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20, 30, 300, 100);
    frame.getContentPane().setLayout(null);
    
    JButton butt=new JButton ("click me");
    frame.getContentPane().add(butt);
    butt.setBounds(20, 20, 200, 20);
    
    Praktikum3 app = new Praktikum3 () {};
    
    app.label = new JLabel("nama saya merupakan");
    app.label.setBounds(20, 40, 200, 20);
    frame.getContentPane().add(app.label);
    
    
    butt.addActionListener(app);
    frame.setVisible(true);
}
    public void actionPerformed(ActionEvent e)
    {
        label.setText("adrian genteng berkali-kali");
    }     
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                createAndShowGUI();
            }
        });
    }
JLabel label;    
}
