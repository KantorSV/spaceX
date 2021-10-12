package com.app;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Utilita");
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        JLabel label = new JLabel("Введите значение");
        panel.add(label);

        JTextField nameField = new JTextField(15);
        panel.add(nameField);

        JButton button = new JButton("Click");
        panel.add(button);

        JTextField programOutputField = new JTextField(15);
        panel.add(programOutputField);

        MyActionListener myActionListener = new MyActionListener();
        myActionListener.userText = nameField;
        myActionListener.programOutputText = programOutputField;
        button.addActionListener(myActionListener);

        frame.setVisible(true);
    }
}
