/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Font;
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
public class Delete extends Menu{
    private JFrame jf= new JFrame("Delete student's information!");
    private JButton jb= new JButton("Delete");
    private JLabel jl=new JLabel("Please enter the student ID to be deleted");
    private JTextField jt = new JTextField();
    private String s= null;
    private String sq=null;
    public Delete() throws Exception{
        super();
        Font fo= new Font("Serief",Font.BOLD,12);
        jl.setFont(fo);
        jt.setBounds(15,15,150,30);
        jb.setBounds(175,15,60,30);
        jl.setBounds(10,80,80,30);
        jf.add(jt);
        jf.add(jb);
        jf.add(jl);
        jf.setSize(300,170);
        jf.setLocation(300,250);
        jf.setVisible(true);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 if(e.getSource() == jb){
                    if(jt.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "The entered information cannot be empty, please re-enter!","Error message!",
                        JOptionPane.INFORMATION_MESSAGE);
                        f.dispose();
                        jf.dispose();
                        try{
                            new Delete();
                        }catch(Exception ex){}
                    }else{
                        s = jt.getText().trim();
                        
                            int t = Integer.parseInt(jt.getText().trim());
                            if(t<=0){
                                JOptionPane.showMessageDialog(null, "The student id entered cannot be 0 or a negative number","Error message!",
                                JOptionPane.INFORMATION_MESSAGE);
                                f.dispose();
                                jf.dispose();
                                try{
                                    new Delete();
                                }catch(Exception ex){}
                            }else{
                                sq = "delete from stu where id="+t;
                                jf.dispose();
                                try{
                                    show(sql,1,sq);
                                }catch(Exception ex){}
                            }
                        }
                 }  
            }
         });
                
    }
}
