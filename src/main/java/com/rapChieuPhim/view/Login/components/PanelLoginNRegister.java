package com.rapChieuPhim.view.Login.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import com.rapChieuPhim.view.Login.swing.Button;
import com.rapChieuPhim.view.Login.swing.MyTextField;
/**
 *
 * @author DinhAn
 */
public class PanelLoginNRegister extends javax.swing.JLayeredPane {
    
    public PanelLoginNRegister() {
        initComponents();
        initRegister();
        initLogin();
        
        login.setVisible(false);
        register.setVisible(true);
    }
    
    private void initRegister()
    {
        register.setLayout(new MigLayout("wrap", "push[center]push","push[]25[]10[]10[]25[]push"));

        //title 
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7,164,121));
        register.add(label);
        
        //username
        MyTextField textUser = new MyTextField();
        textUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        textUser.setHint("username");
        register.add(textUser,"w 60%");
        
        //email
        MyTextField textEmail = new MyTextField();
        textEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/mail.png")));
        textEmail.setHint("email");
        register.add(textEmail,"w 60%");
        
        //password
        MyTextField textPass = new MyTextField();
        textPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        textPass.setHint("password");
        register.add(textPass,"w 60%");
        
        //sign up button
        Button cmd = new Button();
        cmd.setBackground(new Color(7,164,121));
        cmd.setForeground(new Color(250,250,250));
        cmd.setText("SIGN UP");
        register.add(cmd, "w 40%, h 40");
    }
    private void initLogin()
    {
        login.setLayout(new MigLayout("wrap", "push[center]push","push[]25[]10[]10[]25[]push"));
        
        //title 
        JLabel label = new JLabel("Sign In");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7,164,121));
        login.add(label);
        
        //username
        MyTextField textUser = new MyTextField();
        textUser.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        textUser.setHint("username");
        login.add(textUser,"w 60%");
        
        //password
        MyTextField textPass = new MyTextField();
        textPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        textPass.setHint("password");
        login.add(textPass,"w 60%");
        
        //sign in button
        Button cmd = new Button();
        cmd.setBackground(new Color(7,164,121));
        cmd.setForeground(new Color(250,250,250));
        cmd.setText("SIGN IN");
        login.add(cmd, "w 40%, h 40");
    }
    
    public void showRegister(boolean show)
    {
        if(show)
        {
            register.setVisible(true);
            login.setVisible(false);
        }
        else
        {
            register.setVisible(false);
            login.setVisible(true);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
