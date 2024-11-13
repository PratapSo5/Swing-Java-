// Working with  JLabel,JButton and JTextField classes
import  java.awt.event.*;
import  javax.swing.*;
public class SEx4 extends JFrame implements  ActionListener {
    JLabel lb;
    JTextField tf;
    JButton btn;
    public  SEx4(){
        lb=new  JLabel("Enter a message");
        tf=new  JTextField();
        btn=new JButton("show");
        lb.setBounds(10,10,100,20);
        tf.setBounds(110,10,70,20);
        btn.setBounds(60,40,80,20);
        setLayout(null);
        add(lb);
        add(tf);
        add(btn);
        setVisible(true);
        setSize(900,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(this);

    }
    public  void actionPerformed(ActionEvent a){
        String msg=tf.getText();
        JOptionPane.showMessageDialog(this, msg);
    }
    public static void main(String[] args) {
        new SEx4();
    }
}
