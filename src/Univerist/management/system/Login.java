
package Univerist.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,cancel;
    JTextField tfusername, tfpassword;
    
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel l3=new JLabel("Login");
        l3.setBounds(120, 10, 400, 40);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Young Serif",Font.BOLD,30));
        add(l3);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Arial",Font.BOLD,20));
        lblusername.setBounds(40, 85, 100, 25);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(170, 85, 150, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Arial",Font.BOLD,20));
        lblpassword.setBounds(40, 145, 100, 25);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(170, 145, 150, 30);
        add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(40, 220, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200, 220, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(370,50, 200, 200);
        add(image);
        
        setSize(650,350);
        setLocation(500,250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
            String username = tfusername.getText();
            String password= tfpassword.getText();
            
             String query = "select * from login where username='"+username+"' and password='"+password+"'";
             
              try {
                Conn con = new Conn();
                ResultSet rs = con.stm.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }
    public static  void main(String[] args)
    {
        new Login();
    }

    
}
