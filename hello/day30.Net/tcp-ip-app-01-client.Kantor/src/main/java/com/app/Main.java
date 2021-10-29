package com.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {
            //String host = "127.0.0.1";
            String host = "138.68.149.71";
            int port = 1234;
            Socket socket = new Socket(InetAddress.getByName(host), port);
            writeData("Denys", socket);
            String messageFromServer = readData(socket);
            System.out.println("server: " + messageFromServer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeData(String message, Socket socket) throws IOException {

        OutputStream out = socket.getOutputStream();
        byte[] data = message.getBytes();
        out.write(data);
        out.flush();
        System.out.println("send data to server: " + message);
    }

    private static String readData(Socket socket) throws IOException {

        InputStream in = socket.getInputStream();
        while (in.available() <=0){

        }
        byte[] data = new byte[in.available()];
        in.read(data);
        return new String(data);
    }
}
