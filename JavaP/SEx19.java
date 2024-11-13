//  WAP for saving the context and opening the existing file
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
 public class SEx19 extends JFrame implements  ActionListener {
    JTextArea ta;
    JButton save,open,close,clear,back;
    public SEx19(){
        ta=new JTextArea();
        save=new JButton("save");
        open=new JButton("open");
        close=new JButton("close");
        clear=new JButton("clear");
        back=new JButton("back");
        setLayout(null);
        ta.setBounds(15,10,350,200);
        save.setBounds(10,230,80,20);
        open.setBounds(100,230,80,20);
        close.setBounds(190,230,80,20);
        clear.setBounds(280,230,80,20);
        back.setBounds(130,260,120,20);
        add(ta);
        add(save);
        add(close);
        add(open);
        add(clear);
        add(back);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        save.addActionListener(this);
        open.addActionListener(this);
        close.addActionListener(this);
        clear.addActionListener(this);
        back.addActionListener(this);
    }
    @ Override
    public  void actionPerformed(ActionEvent a){
        if(a.getSource()==open){
            JFileChooser fc=new  JFileChooser();
            int i=fc.showOpenDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){
                File f=fc.getSelectedFile();
                String filepath=f.getPath();
                try{
                    BufferedReader br=new BufferedReader(new FileReader(filepath));
                    String s1=" ",s2=" ";
                    while((s1=br.readLine())!=null){
                        s2=s2+s1+"\n";
                    }
                    ta.setText(s2.toString());
                    br.close();
                }catch(Exception e){
                    e.printStackTrace();}
            }
        }
        if(a.getSource()==save){
            String sb= ta.getText();
            JFileChooser chooser=new  JFileChooser();
            int i=chooser.showSaveDialog(null);
            if(i==JFileChooser.APPROVE_OPTION){
                File f=chooser.getSelectedFile();
                String filepath=f.getPath();
                FileWriter fw;
                try{
                    fw=new FileWriter(filepath);
                    fw.write(sb);
                    fw.close();
                }catch(IOException e){}
            }
        }
        if(a.getSource()==close){
            System.exit(1000);
        }
        if(a.getSource()==clear){
            ta.setText(" ");
            if(a.getSource()==back){
                Color c=JColorChooser.showDialog(this, null, Color.yellow);
                ta.setBackground(c);
            }
        }
    
    }
    public static void main(String[] args) {
        new  SEx19();
    }
}
