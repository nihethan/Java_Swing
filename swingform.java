package swing.swingpractice;


import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
public class swingform extends JFrame{
     swingform(){
        JFrame f1=new JFrame("Registeration");

        JLabel l3=new JLabel("Login");
        l3.setBounds(185,50,50,30);

        JLabel l1=new JLabel("Gmail");
        l1.setBounds(80,100,50,30);

        JTextField tf1=new JTextField(20);
        tf1.setBounds(160,100,200,25);

        JLabel l2=new JLabel("Password");
        l2.setBounds(80,135,70,30);

        JTextField tf2=new JTextField(20);
        tf2.setBounds(160,135,200,25);

        JLabel l4=new JLabel("Gender");
        l4.setBounds(80,180,50,25);

        JCheckBox c1=new JCheckBox("Male");
        c1.setBounds(160,170,70,30);

        JCheckBox c2=new JCheckBox("Female");
        c2.setBounds(160,190,90,30);

        JLabel l5=new JLabel("Age");
        l5.setBounds(80,225,30,30);

        JTextField tf3=new JTextField(3);
        tf3.setBounds(160,225,30,20);

        JButton b1=new JButton("Submit");
        b1.setBounds(160,300,80,30);
        ActionListener s=new ActionListener() {
         public void actionPerformed(ActionEvent e){
            System.out.println(tf1.getText());
            System.out.println(tf2.getText());
            System.out.println(tf3.getText());
         }
      };

        b1.addActionListener(s);
        f1.add(l3);
        f1.add(l1);
        f1.add(tf1);
        f1.add(l2);
        f1.add(tf2);
        f1.add(l5);
        f1.add(tf3);
        f1.add(l4);
        f1.add(c1);
        f1.add(c2);
        f1.add(b1);

        f1.setSize(400,500);
        f1.setLayout(null);
        f1.setVisible(true);

 
        
        

     }
     public static void main(String[]args){
        new swingform();
     }
}


