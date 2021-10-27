package com.app;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9091);

            System.out.println("SERVER STARTED!!!!");
            Socket socket  = serverSocket.accept();
            InputStream in = socket.getInputStream();

            String clientData = readData(in);
            System.out.println("RECEIVED data from client: "+clientData);

            Thread.sleep(10000);

            OutputStream out = socket.getOutputStream();
            writeData(out);


        } catch (Exception ex){
            ex.printStackTrace();
        }



    }

    private static String readData(InputStream in) throws IOException  {
        byte[]  data = new byte[17];
        in.read(data);
        return new String(data);
    }

    private static void writeData(OutputStream out) throws IOException {
        String messageFromServer = "Hello form server "+new Date();
        byte[] data = messageFromServer.getBytes();
        out.write(data);
    }


}
