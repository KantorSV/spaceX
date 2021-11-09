package com.app;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientThread extends Thread {

    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try {
            while (true) {
                InputStream in = socket.getInputStream();
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                ChatMessage chatMessage = (ChatMessage) objectInputStream.readObject();
                System.out.println(chatMessage);
                DataModule.getInstance().sendToAll(chatMessage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
