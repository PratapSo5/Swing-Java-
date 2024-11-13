// Accept  a  value  and find the  square  value

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
;
public class SEx5 extends  JFrame implements  ActionListener {
    JLabel lb;
    JTextField tf;
    JButton btn;
    public   SEx5(){
        lb=new  JLabel("Enter a value");

        tf=new  JTextField();
        btn=new JButton("Find the sqaure value");
        lb.setBounds(10,10,80,20);
        tf.setBounds(100,10,60,20);
        btn.setBounds(30,40,130,20);
        setLayout(null);
        add(lb);
        add(tf);
        add(btn);
        setVisible(true);
        setSize(400,200);
        btn.addActionListener(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public  void  actionPerformed(ActionEvent a){
        if((tf.getText()).equals(" ")){
        JOptionPane.showMessageDialog(this, "empty Text Field");
    }
        else{
            int  b=Integer.parseInt(tf.getText());
            int sq=b*b;
            JOptionPane.showMessageDialog(this, " A squqre  val = "+sq);
        }
    }
    public static void main(String[] args) {
        new  SEx5();
    }
}
