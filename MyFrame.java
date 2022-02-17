package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    ActionListener actionListener1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JLabel label;

    MyFrame() {
        label = new JLabel();
        label.setText("0");
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);

    
        label.setForeground(Color.yellow);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        
        label.setBounds(450, 450, 100, 100);
        this.add(label);

        button1 = new JButton();
        button1.setText("^");
        button1.setBounds(200, 200, 100, 100);

        button2 = new JButton();
        button2.setText("v");
        button2.setBounds(200, 200 + 100, 100, 100);

        button3 = new JButton();
        button3.setText("<");
        button3.setBounds(200 - 100, 200 + 100, 100, 100);

        button4 = new JButton();
        button4.setText(">");
        button4.setBounds(200 + 100, 200 + 100, 100, 100);

        button1.addActionListener(this);
        button1.setFocusable(false);

        button2.addActionListener(this);
        button2.setFocusable(false);

        button3.addActionListener(this);
        button3.setFocusable(false);

        button4.addActionListener(this);
        button4.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(1980, 1080);


        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            label.setBounds(label.getX(), label.getY() - 25, label.getWidth(), label.getHeight());
        } else if (e.getSource() == button2) {
            label.setBounds(label.getX(), label.getY() + 25, label.getWidth(), label.getHeight());;
        } else if (e.getSource() == button3) {
            label.setBounds(label.getX() - 25, label.getY(), label.getWidth(), label.getHeight());
        } else if (e.getSource() == button4) {
            label.setBounds(label.getX() + 25, label.getY(), label.getWidth(), label.getHeight());
        }
    }
}
