package com.company.designPattern.factoryPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class WindowsButton implements Button {
    JPanel jPanel=new JPanel();
    JFrame jFrame=new JFrame();
    JButton button1;
    JButton button2;


    @Override
    public void onClick() {
button1= new JButton("Enter");
button2= new JButton("Exit");
button1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.setVisible(false);
        System.out.println(0);
    }
});
button2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.setVisible(false);
        System.out.println(0);
    }
});


    }

    @Override
    public void render() {

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Hello WorLd");
        jLabel.setOpaque(false);

        jLabel.setBackground(new Color(0, 123, 1));
        jLabel.setFont(new Font("dialog", Font.ITALIC, 44));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(jPanel);
//        jFrame.add( jPanel.add(jLabel));
        jPanel.add(jLabel);
        onClick();
        jPanel.add(button1) ;
        jPanel.add(button2);

        jFrame.setSize(320, 200);
        jFrame.setVisible(true);
        onClick();

    }
}
