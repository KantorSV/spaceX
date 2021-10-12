package com.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public JTextField userText;
    public JTextField programOutputText;


    public void actionPerformed(ActionEvent e) {
        String name = userText.getText();
        programOutputText.setText("Hello, "+name);
       // System.out.println(name);

    }
}
