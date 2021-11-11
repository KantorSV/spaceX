package com.app;

import javafx.scene.control.TextArea;
import org.example.Utils;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket socket;



    public ServerThread(Socket socket) {
        this.socket = socket;

    }

    public void run() {
        try {
            while (true) {
                InputStream in = socket.getInputStream();
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                ChatMessage chatMessage = (ChatMessage) objectInputStream.readObject();
                System.out.println(chatMessage);
                String oldText = Utils.textArea.getText();
                Utils.textArea.setText(oldText + "\n" + chatMessage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

