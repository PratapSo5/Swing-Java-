// Write a swing  programe for working with some buttons
import javax.swing.JButton;
import  javax.swing.JFrame;
public class SEx2 extends  JFrame {
    JButton bt1,bt2,bt3;
    public SEx2(){
        bt1=new JButton("ok");
        bt2=new JButton("Save");
        bt3=new JButton("Cancel");
        bt1.setBounds(40,20,70,20);
        bt2.setBounds(40,50,70,20);
        bt3.setBounds(40,80,70,20);
        setLayout(null);
        add(bt1);
        add(bt2);
        add(bt3);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SEx2();
    }
}
