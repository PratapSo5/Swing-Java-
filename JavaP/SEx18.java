// Working with JTable control
import  javax.swing.*;
public class SEx18 extends JFrame {
    JLabel lb1;
    JTable t;
    public  SEx18(){
        lb1=new  JLabel("Students record");
        String col[]={"RollNo","Name","Fee"};
        String data[][]={
            {"1","xyz","100"},
            {"2","PQR","150"},
            {"3","ABC","100"}
    };
    t=new  JTable(data,col);
    t.setBounds(10,60,110,60);
    lb1.setBounds(40,20,150,20);
    setLayout(null);
    JScrollPane p=new  JScrollPane(t);
    add(lb1);
    add(t);
    setVisible(true);
    setSize(400,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new  SEx18();
    }
}
