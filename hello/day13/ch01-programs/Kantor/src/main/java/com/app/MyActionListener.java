package com.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public JTextField userText;
    public JTextField programOutputText;

    public void actionPerformed(ActionEvent e) {
        String name = userText.getText();
        programOutputText.setText(name);
        System.out.println("https://www.youtube.com/watch?v=94Wr13wW-X4 :_____" + name);
    }
}
