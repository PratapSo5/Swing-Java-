// Write a  programn for formatting the controls

import java.awt.Color;
import java.awt.Font;
import  javax.swing.*;
public class SEx11 extends  JFrame {
    JLabel lb1,lb2,lb3;
    public SEx11(){
        lb1=new JLabel();
        lb2=new JLabel();
        lb3=new JLabel();
        lb1.setText("Welcome");
        lb2.setText("How are you");
        lb3.setText("Fine");
        setBackground(Color.gray);
        lb1.setForeground(Color.red);
        lb2.setForeground(Color.yellow);
        lb2.setForeground(Color.pink);
        lb3.setFont(new Font("AiralBlack",Font.BOLD,28));
        lb3.setForeground(Color.cyan);
        lb3.setBackground(Color.red);
        lb1.setBounds(30,20,80,20);
        lb2.setBounds(30,60,180,20);
        lb3.setBounds(30,150,100,20);
        setLayout(null);
        add(lb1);
        add(lb2);
        add(lb3);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    

    }
    public static void main(String[] args) {
        new SEx11();
    }
}
