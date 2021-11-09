package com.app;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {
            ServerSocket socket = new ServerSocket(8083);
            System.out.println("Server Started");
            while (true) {
                Socket clientSocket = socket.accept();
                DataModule.getInstance().addClient(clientSocket);
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
