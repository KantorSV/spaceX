package com.app;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program");
        frame.setSize(300, 500);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        JLabel label = new JLabel("Введите имя:");
        panel.add(label);

        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        JButton button = new JButton("Click");
        panel.add(button);

        JTextField programOutputField = new JTextField(20);
        panel.add(programOutputField);

        MyActionListener myActionListener = new MyActionListener();
        myActionListener.userText = nameField;
        myActionListener.programOutputText = programOutputField;
        button.addActionListener(myActionListener);

        frame.setVisible(true);
    }
}
