package com.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My Programm");
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);


        JLabel label = new JLabel("Введите имя: ");
        panel.add(label);

        JTextField nameField = new JTextField(15);
        panel.add(nameField);

        JButton button = new JButton("Click");
        panel.add(button);


        JTextField programOutputField = new JTextField(15);
        panel.add(programOutputField);




        MyActionListener myActionListener = new MyActionListener();
        myActionListener.userText=nameField;
        myActionListener.programOutputText = programOutputField;
        button.addActionListener(myActionListener);








        //Container container = frame.getContentPane();
        //container.add(button);




        //frame.setPreferredSize(new Dimension(100,100));
        frame.setVisible(true);

    }
}
