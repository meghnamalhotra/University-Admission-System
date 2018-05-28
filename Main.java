package forms;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
public class Main extends JFrame 
{
 JTextArea jta1;
 JLabel l1,l2,l3,l4,l5,l6,l7;
 Font f,f1,f2;
 
public Main()
{
   f=new Font("Verdana",Font.ITALIC+Font.BOLD,30);
   f1=new Font("Arial",Font.BOLD,40);
   f2=new Font("Arial",Font.BOLD,70);
   l1=new JLabel("*************************PROJECT NAME*************************");
   l2=new JLabel("UNIVERSITY ADMISSION SYSTEM");
   l3=new JLabel("MADE BY:-");
   l4=new JLabel("RISHABH SACHDEVA");
   l5=new JLabel("MRIDUL JAITLEY");
   l6=new JLabel("MEGHNA MALHOTRA");
   l7=new JLabel("Special thanks to Aditya Setia");
   setLayout(null);
    l1.setBounds(130,100,1200,30);
    l2.setBounds(130,250,1300,100);
    l3.setBounds(700,400,1000,30);
    l4.setBounds(900,400,1000,30);
    l5.setBounds(900,450,1000,30);
    l6.setBounds(900,500,1000,30);
    l7.setBounds(800,550,1000,30);
    l1.setFont(f1);
    l2.setFont(f2);
    l3.setFont(f);
    l4.setFont(f);
    l5.setFont(f);
    l6.setFont(f);
    l7.setFont(f);
    add(l7);
    l1.setForeground(Color.DARK_GRAY);
    l2.setForeground(Color.blue);
    add(l1);add(l2); add(l3);add(l4);
     add(l5);add(l6);

    

}
public static void main(String[] args)
    {
      Main obj=new Main();
      obj.getContentPane().setBackground(Color.WHITE);
        obj.setSize(1350,700);
        obj.setLocation(10,0);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
 
}
