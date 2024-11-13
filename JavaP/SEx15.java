// Working with RadioButton control with event handling

import  java.awt.event.*;
import  javax.swing.*;
public class SEx15 extends  JFrame implements ActionListener {
    JRadioButton m,f;
    JButton show;
    public  SEx15(){
        show=new JButton("show"); 
        m=new  JRadioButton("male",true);
        f=new JRadioButton("female");
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
    public  void actionPerformed(ActionEvent a){
        if(m.isSelected())
        JOptionPane.showMessageDialog(this," your selected grnder "+m.getText());

        if(f.isSelected())
        JOptionPane.showMessageDialog(this," your selected grnder "+f.getText());
    }
    public static void main(String[] args) {
        new SEx15();
    }
}
