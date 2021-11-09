package com.app;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class DataModule {

    private static DataModule inst = new DataModule();

    private List<Socket> clients = new ArrayList<>();

    private DataModule() {
    }

    public void addClient(Socket socket) {
        clients.add(socket);
    }

    public void sendToAll(ChatMessage chatMessage) {
        try {


            for (int i = 0; i < clients.size(); i++) {
                Socket socket = clients.get(i);
                OutputStream out = socket.getOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                objectOutputStream.writeObject(chatMessage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static DataModule getInstance() {

        return inst;

    }
}
