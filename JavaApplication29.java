/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

/**
 *
 * @author jawaher
 */
//جواهر مرعي القحطاني
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaApplication29 extends JFrame implements ActionListener{
    JLabel l,l1;
    JTextField tx;
    JButton b,b1,b2;
    Container c=getContentPane();
    public JavaApplication29 (){
        setTitle("Change background");
        setSize(250,250);
        setLocation(100,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        c.setBackground(Color.white);
        c.setLayout(new FlowLayout());
        l= new JLabel("white background");
        l1= new JLabel("name");
        tx= new JTextField(15);
        b=new JButton("red");
         b1=new JButton("blue");
          b2=new JButton("gray");
         b.addActionListener(this);
          b1.addActionListener(this);
           b2.addActionListener(this);
           tx.addActionListener(this);
           c.add(l1);
           c.add(tx);
           c.add(b);
            c.add(b1);
             c.add(b2);
             c.add(l);
           
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication29 j= new JavaApplication29();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()instanceof JButton)
           if(e.getSource()==b){
               c.setBackground(Color.red);
           l.setText("red background");}
           else if (e.getSource()==b1){
                c.setBackground(Color.blue);
           l.setText("blue background");
           }
           else{
                  c.setBackground(Color.gray);
           l.setText("gray background");
           }
       else 
           JOptionPane.showMessageDialog(this, "Hello "+tx.getText());
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
