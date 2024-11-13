// Write a program for working login window


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SEx12 extends JFrame implements ActionListener {
    JLabel lb1,lb2,lb3;
    JTextField tf1;
    JPasswordField tf2;
    JButton login,cancel;
    public SEx12() {
        lb1=new JLabel("login window");
        lb2=new JLabel("Enter username");
        lb3=new JLabel("Enter passward");
        tf1=new JTextField();
        tf2=new JPasswordField();
        login=new  JButton("login");
        cancel=new  JButton("cancel");
        lb1.setFont(new Font("Monotype carsiva",Font.BOLD,28));
        lb1.setForeground(Color.red);
        lb1.setBackground(Color.blue);
        lb2.setForeground(Color.green);
        lb3.setForeground(Color.green);
        login.setOpaque(true);
        cancel.setOpaque(true);
        login.setForeground(Color.red);
        login.setBackground(Color.blue);
        cancel.setForeground(Color.yellow);
        cancel.setBackground(Color.blue);
        lb1.setBounds(80,10,200,50);
        lb2.setBounds(10,70,100,20);
        tf1.setBounds(120,70,100,20);
        lb3.setBounds(10,100,100,20);
        tf2.setBounds(120,100,100,20);
        login.setBounds(50,140,80,20);
        cancel.setBounds(140,140,80,20);
        setLayout(null);
        add(lb1);
        add(lb2);
        add(lb3);
        add(tf1);
        add(tf2);
        add(login);
        add(cancel);
        setVisible(true);
        setSize(400,400);
        login.addActionListener(this);
        cancel.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent a){
        String u=tf1.getText();
        String p=tf2.getText(); 
        if(a.getSource()==login){
            if(u.equals("ABC") && p.equals("123"))
            JOptionPane.showMessageDialog(this," You are login" );
            else
            JOptionPane.showMessageDialog(this,"incorrect information" );
        }
        if(a.getSource()==cancel){
            tf1.setText(" ");
            tf2.setText(" ");
        }
    }
    public static void main(String[] args) {
        new  SEx12();
    }
}
