// Working with checkbox control
import javax.swing.*;
public class SEx13 extends JFrame {
    JCheckBox m,f;
    public SEx13(){
        m=new JCheckBox("male",true);
        f=new JCheckBox("female");
        m.setBounds(20,20,60,20);
        f.setBounds(20,50,60,20);
        setLayout(null);
        add(m);
        add(f);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SEx13();
    }
}
