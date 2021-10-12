package com.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public JTextField userText;
    public JTextField programOutputText;
    int a = 2;
    int b = 4;
    int c = a + b;

    public void actionPerformed(ActionEvent e) {
        String name = userText.getText();
        programOutputText.setText(name);
        System.out.println("a + b = " + c);

    }

}
