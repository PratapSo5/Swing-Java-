// Working with chekbox with EventHandling
import java.awt.event.*;
import  javax.swing.*;
public class SEx14 extends JFrame implements ActionListener {
    JCheckBox m,f;
    JButton show;
    public SEx14(){
        show=new  JButton("show");
        m=new JCheckBox("male",true);
        f=new JCheckBox("male");
        m.setBounds(20,20,60,20);
        f.setBounds(20,50,60,20);
        show.setBounds(20,80,70,20);
        setLayout(null);
        add(show);
        add(m);
        add(f);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show.addActionListener(this);

    }
    public void actionPerformed(ActionEvent a){
        if(m.isSelected())
            JOptionPane.showMessageDialog(this, "your selected gender"+m.getText());
        
        if(f.isSelected())
        JOptionPane.showMessageDialog(this,"your selected gender "+f);
    }
    public static void main(String[] args) {
        new  SEx14();
    }
}
