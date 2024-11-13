import javax.swing.JFrame;
import javax.swing.JLabel;
public class SEx1 extends JFrame {
    JLabel msg;
    public  SEx1(){
        msg=new JLabel("Welcome");
        msg.setBounds(40,40,90,20);
        setLayout(null);
        add(msg);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new  SEx1();
    }
}
