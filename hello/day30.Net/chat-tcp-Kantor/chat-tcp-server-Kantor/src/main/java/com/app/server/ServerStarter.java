package com.app.server;

import com.chat.tcp.common.Connector;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStarter {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8712);
        System.out.println("----------------SERVER_STARTED-----------------");
        while (true) {
            Socket client = serverSocket.accept();
            Connector connector = new ClientConnector(client);
            connector.startWorking();
            ClientsDataModule.getInstance().add(connector);
        }

    }
}
