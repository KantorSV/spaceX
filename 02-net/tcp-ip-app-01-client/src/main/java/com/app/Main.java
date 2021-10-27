package com.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            String host = "127.0.0.1";
            int port = 9091;
            Socket socket = new Socket(InetAddress.getByName(host), port);

            writeData("This is client!!!", socket);
            String messageFromServer = readData(socket);
            System.out.println(messageFromServer);

            //Thread.sleep(Integer.MAX_VALUE);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void writeData(String message, Socket socket) throws IOException {
        OutputStream out = socket.getOutputStream();
        byte[] data = message.getBytes();
        out.write(data);
        out.flush();
        System.out.println("send data dto server: "+message);
    }

    private static String readData(Socket socket) throws IOException {
        InputStream in = socket.getInputStream();
        byte[] data = new byte[100];
        in.read(data);
        return new String(data);
    }

}
