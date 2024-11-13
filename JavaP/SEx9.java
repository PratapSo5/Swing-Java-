// Write a swing program for displaying a message

import java.awt.event.*;
import  javax.swing.*;
public class SEx9 extends  JFrame implements ActionListener {
    JFrame f=new JFrame("Welcome page");
    JButton btn;
    public  SEx9(){
        btn=new  JButton("ok");
        btn.setBounds(20,20,50,20);
        f.setLayout(null);
        f.add(btn);
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        btn.addActionListener(this);
    }
    public  void  actionPerformed(ActionEvent a){
        JOptionPane.showMessageDialog(this, "Welcome page");
    }
    public static void main(String[] args) {
        new  SEx9();
    }
}
