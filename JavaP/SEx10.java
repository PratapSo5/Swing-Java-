// working with button back and fore colors
// note:- for button only,setOpaque() should be true

import javax.swing.*;
import  java.awt.event.*;
import  java.awt.*;
public class SEx10 extends JFrame implements  ActionListener {
    JFrame f=new  JFrame("welcome page");
    JButton btn;
    public  SEx10(){
        btn=new  JButton("ok");
        btn.setBounds(20,20,50,20);
        f.setLayout(null);
        f.add(btn);
        btn.setBackground(Color.YELLOW);
        btn.setForeground(Color.red);
        btn.setOpaque(true);
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        btn.addActionListener(this);
    }
    public  void actionPerformed(ActionEvent a){
        JOptionPane.showMessageDialog(this, "welcome page");
    }
    public static void main(String[] args) {
        new SEx10();
    }
}
