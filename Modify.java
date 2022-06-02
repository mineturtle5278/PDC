/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 64211
 */
public class Modify extends Menu { 
    private JFrame jf = new JFrame ("Edit student information") ; 
    private JLabel jl0 = new JLabel ("Please enter the information") ; 
    private JLabel jl1 = new JLabel ( "Student ID:" ) ; 
    private JTextField jt1 = new JTextField ( ) ; 
    private JLabel jl2 = new JLabel ( " Student Name: " ) ; 
    private JTextField jt2 = new JTextField ( ) ; 
    private JLabel jl3 = new JLabel ( "Math:  " ) ; 
    private JTextField jt3 = new JTextField ( ) ; 
    private JLabel jl4 = new JLabel ( " Physics: " ) ; 
    private JTextField jt4 = new JTextField ( ) ; 
    private JLabel jl5 = new JLabel ( " English: " ) ; 
    private JTextField jt5 = new JTextField ( ) ; 
    private JButton bt1 = new JButton ( "Submit" ) ; 
    private JButton bt2 = new JButton ( "Quit" ) ; 
    private JLabel xin = new JLabel ( " " ) ; 
    private int id , idt ; 
    private String na = null ; 
    private String sq = null ; 
    private float m , ph , en , aver , su ; 
    public Modify ( ) throws Exception { 
        super ( ) ;
        jl0.setBounds ( 10 , 10 , 120 , 30 ) ; 
        jl1.setBounds ( 10,50,60 , 30 ) ; 
        jt1.setBounds ( 80,50 , 180,30 ) ; 
        jl2.setBounds ( 10,90,60 , 30 ) ; 
        jt2.setBounds ( 80,90 , 180 , 30 ) ; 
        jl3.setBounds ( 10,130 , 60,30 ) ; 
        jt3.setBounds ( 80 , 130 , 180 , 30 ) ; 
        jl4.setBounds ( 10 , 170,60,30 ) ; 
        jt4.setBounds ( 80 , 170 , 180 , 30 ) ; 
        jl5.setBounds (10,210,60,30 ) ;
        jt5.setBounds(80,210,180,130);
        bt1.setBounds(20,250,60,30);
        bt2.setBounds(90,250,60,30);
        xin.setBounds(10,300,100,30);
        jf.add(jl0);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jl2);
        jf.add(jt2);
        jf.add(jl3);
        jf.add(jt3);
        jf.add(jl4);
        jf.add(jt4);
        jf.add(jl5);
        jf.add(jt5);
        jf.add(bt1);
        jf.add(bt2);
        jf.add(xin);
        jf.setSize(400,400);
        jf.setLocation(300,200);
        jf.setVisible(true);
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==bt1){
                    if(jt1.getText().trim().equals("")||jt2.getText().trim().equals("")||jt3.getText().trim().equals("")
                     ||jt4.getText().trim().equals("")||jt5.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "The entered information cannot be empty, please re-enter!","Error message!",
                        JOptionPane.INFORMATION_MESSAGE);
                        f.dispose();
                        jf.dispose();
                        try{
                            new Modify();
                         
                        }catch(Exception ex){}
                    }else if(Integer.parseInt(jt1.getText())<0||Float.parseFloat(jt3.getText())<0||Float.parseFloat(jt4.getText())<0||Float.parseFloat(jt5.getText())<0){
                        JOptionPane.showMessageDialog(null, "The entered information cannot be a negative number, please re-enter!","Error message!",
                        JOptionPane.INFORMATION_MESSAGE);
                        f.dispose();
                        jf.dispose();
                        try{
                            new Modify();
                        }catch(Exception ex){}
                    }else{
                        id=Integer.parseInt(jt1.getText().trim());
                        na=jt2.getText().trim();
                        m=Float.parseFloat(jt3.getText().trim());
                        ph=Float.parseFloat(jt4.getText().trim());
                        en=Float.parseFloat(jt5.getText().trim());
                        su =m+ph+en;
                        aver=toTwo((float)(su/3.0));
                        sq="update stu set name= '"+na+"', math="+m+",physics="+ph",english="+en+",average="+aver+",sum="+su+" where id="+id;
                        try{
                            jf.dispose();
                            show(sql,1,sq);
                        }catch(Exception ex){}
                    }
                }
            }
        });
        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==bt2){
                    jf.dispose();
                }
            }
        });
    }
}