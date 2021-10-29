package com.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(1234);

            System.out.println("Server STARTED");
            Socket socket = serverSocket.accept();

            InputStream in = socket.getInputStream();

            String clientData = readData(in);
            System.out.println("client: " + clientData);

            Thread.sleep(10000);


            String responseFromServer = createResponse(clientData);
            OutputStream out = socket.getOutputStream();
            writeData(out, responseFromServer);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readData(InputStream in) throws IOException {
        while(in.available()<=0){

        }
        byte[] data = new byte[in.available()];
        in.read(data);
        return new String(data);
    }

    private static void writeData(OutputStream out, String serverResponse) throws IOException {
        //String messageFromClient = "Hello, I`am Server !!!";
        byte[] data =serverResponse.getBytes();
        out.write(data);

    }


    private static String createResponse(String clientMessage){
        System.out.println(clientMessage);
        if("Denys".equalsIgnoreCase(clientMessage)){
            return "You are 34. My name is Homer. I live in Kyiv!!!!!!!!!" + new Date();
        }
        if("Serhii".equalsIgnoreCase(clientMessage)){
            return "You are 34";
        }
        if ("Misha".equalsIgnoreCase(clientMessage)){
            return "You are 8";
        }
        return "UNKNOWING";
    }
}


