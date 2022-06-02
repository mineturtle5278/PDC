/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

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
public class Adda extends Menu {
    private JFrame jf = new JFrame ("Add student information") ; 
    private JLabel jl0 = new JLabel ("Please enter new information") ; 
    private JLabel jl1 = new JLabel ( "Student Name:" ) ; 
    private JTextField jt1 = new JTextField ( ) ; 
    private JLabel jl2 = new JLabel ( "Math: " ) ; 
    private JTextField jt2 = new JTextField ( ) ; 
    private JLabel jl3 = new JLabel ( "Physics:  " ) ; 
    private JTextField jt3 = new JTextField ( ) ; 
    private JLabel jl4 = new JLabel ( " English: " ) ; 
    private JTextField jt4 = new JTextField ( ) ; 
    private JButton bt1 = new JButton ( "Submit" ) ; 
    private JButton bt2 = new JButton ( "Quit" ) ; 
    private JLabel xin = new JLabel ( " " ) ;  
    private String na = null ; 
    private String sq = null ; 
    private float m , ph , en , aver , su ; 
    public Adda( ) throws Exception { 
        super ( ) ;
        jl0.setBounds ( 10 , 10 , 170 , 30 ) ; 
        jl1.setBounds ( 10,50,60,30 ) ; 
        jt1.setBounds ( 80,50 , 180,30 ) ; 
        jl2.setBounds ( 10,90,60 , 30 ) ; 
        jt2.setBounds ( 80,90 , 180 , 30 ) ; 
        jl3.setBounds ( 10,130 , 60,30 ) ; 
        jt3.setBounds ( 80 , 130 , 180 , 30 ) ; 
        jl4.setBounds ( 10 , 170,60,30 ) ; 
        jt4.setBounds ( 80 , 170 , 180 , 30 ) ; 
        bt1.setBounds(20,230,60,30);
        bt2.setBounds(90,230,60,30);
        xin.setBounds(10,260,100,30);
        jf.add(jl0);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jl2);
        jf.add(jt2);
        jf.add(jl3);
        jf.add(jt3);
        jf.add(jl4);
        jf.add(jt4);
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
                     ||jt4.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "The entered information cannot be empty, please re-enter!","Error message!",
                        JOptionPane.INFORMATION_MESSAGE);
                        f.dispose();
                        jf.dispose();
                        try{
                            new Adda();
                         
                        }catch(Exception ex){}
                    }else if(Integer.parseInt(jt1.getText())<0||Float.parseFloat(jt3.getText())<0||Float.parseFloat(jt4.getText())<0){
                        JOptionPane.showMessageDialog(null, "The entered information cannot be a negative number, please re-enter!","Error message!",
                        JOptionPane.INFORMATION_MESSAGE);
                        f.dispose();
                        jf.dispose();
                        try{
                            new Adda();
                        }catch(Exception ex){}
                    }else{
                        
                        na=jt1.getText().trim();
                        m=Float.parseFloat(jt2.getText().trim());
                        ph=Float.parseFloat(jt3.getText().trim());
                        en=Float.parseFloat(jt4.getText().trim());
                        su =m+ph+en;
                        aver=toTwo((float)(su/3.0));
                        sq="insert into stu(name,math,physics,english,average,sum)"+"values('"+na+"',"+m+","+ph+","+en+","+aver","+su+")";
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
