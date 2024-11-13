// Wrorking with  JTextField Class
import  javax.swing.*;
public class SEx3 extends JFrame {
    JTextField tf;
    public SEx3(){
        tf=new JTextField();
        tf.setBounds(10,10,60,20);
        setLayout(null);
        add(tf);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new  SEx3();
    }
}
