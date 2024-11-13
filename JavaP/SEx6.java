// finding square and  cube

import java.awt.event.*;
import  javax.swing.*;

public class SEx6 extends JFrame implements ActionListener {
    JLabel lb;
    JTextField tf;
    JButton btn1,btn2;
    public  SEx6(){
        lb=new  JLabel("Enter  a value");
        tf= new  JTextField();
        btn1=new  JButton("square");
        btn2=new  JButton("Cube");
        lb.setBounds(10,10,80,20);
        tf.setBounds(100,10,60,20);
        btn1.setBounds(30,40,60,20);
        btn2.setBounds(100,40,60,20);
        setLayout(null);
        add(lb);
        add(tf);
        add(btn1);
        add(btn2);
        setVisible(true);
        setSize(4000,400);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public  void actionPerformed(ActionEvent a){
        if(tf.getText().equals(" "))
        JOptionPane.showMessageDialog(this, "Empty textfield");

        else{
            int b=Integer.parseInt(tf.getText());
            if(a.getSource()==btn1)
            JOptionPane.showMessageDialog(this, "sq.val = "+(b*b));

            if(a.getSource()==btn2)
            JOptionPane.showMessageDialog(this, "cube.val = "+(b*b*b));
        }
    }
    public static void main(String[] args) {
        new  SEx6();
    }
}
