// Working with ComboBox
// import java.awt.desktop.AboutEvent;
import java.awt.event.*;
import  javax.swing.*;
public class SEx16 extends  JFrame implements  ActionListener {
    JLabel lb1;
    JComboBox country;
    JButton btn;
    public SEx16(){
        lb1=new JLabel("Select your Country");
        String m[]={"Srilanka","Nepal","America","India"};
        country=new JComboBox(m);
        country.addItem("Austrila");
        btn=new  JButton("show");
        lb1.setBounds(10,10,120,20);
        country.setBounds(140,10,80,20);
        btn.setBounds(30,50,70,20);
        setLayout(null);
        add(lb1);
        add(country);
        add(btn);
        btn.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(400,400);

    }
    public void actionPerformed(ActionEvent a){
        JOptionPane.showMessageDialog(this, "my country is"+country.getSelectedItem());
    }
    public static void main(String[] args) {
        new SEx16();
    }
}
