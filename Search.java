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
public class Search extends Menu{
    private JFrame jf = new JFrame("Find Student Information");
    private JButton jb = new JButton("Search");
    private JLabel jl = new JLabel("Please enter the student number or name of the student you want to search ");
    private JTextField jt = new JTextField();
    private String s = null;
    private String sq = null;
    
    public Search() throws Exception{
        super();
        Font fo = new Font("Serief", Font.BOLD, 12);
        jl.setFont(fo);
        jt.setBounds(15,15,150,30);
        jb.setBounds(175, 15, 60, 30);
        jl.setBounds(10,80,180,30);
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
                            new Search();
                        }catch(Exception ex){}
                    }else{
                        s = jt.getText().trim();
                        try{
                            int t = Integer.parseInt(jt.getText().trim());
                            if(t<=0){
                                JOptionPane.showMessageDialog(null, "The student id entered cannot be 0 or a negative number","Error message!",
                                JOptionPane.INFORMATION_MESSAGE);
                                f.dispose();
                                jf.dispose();
                                try{
                                    new Search();
                                }catch(Exception ex){}
                            }else{
                                sq = "select id, name,math,physics,english,sum from stu where id like '%"+t+"%'";
                                jf.dispose();
                                try{
                                    show(sq,0," ");
                                }catch(Exception ex){}
                            }
                        }catch(Exception ex){
                            sq="select id, name,math,physics,english,average,sum from stu where name like '%"+s+"%'";
                            jf.dispose();
                            try{
                                show(sq,0," ");
                        }catch(Exception ex1){}
                        }
                    }
                }
            }


            
        });
}
}
    

