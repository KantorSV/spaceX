package com.chat.tcp.common;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Utils {

    public static void writeMessage(Socket socket, ChatMessage chatMessage) {
        try {
            OutputStream out = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(chatMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ChatMessage readMessage(Socket socket) {
        try {

            InputStream in = socket.getInputStream();
            while (in.available() <= 0) {
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(in);
            ChatMessage chatMessage = (ChatMessage) objectInputStream.readObject();
            return chatMessage;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
