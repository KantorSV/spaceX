package com.chat.tcp.common;

import java.net.Socket;

public abstract class ChatConnector extends Thread implements Connector {
    private Socket socket;

    public ChatConnector(Socket socket){
        this.socket=socket;
    }

    public void run(){
        while(true){
            ChatMessage chatMessage = readMessage();
            processChatMessage(chatMessage);
        }
    }

    public abstract void processChatMessage(ChatMessage chatMessage);


    @Override
    public void writeMessage(ChatMessage chatMessage) {
        Utils.writeMessage(socket, chatMessage);
    }

    @Override
    public ChatMessage readMessage() {
        return Utils.readMessage(socket);
    }

    @Override
    public void startWorking() {
        start();
    }




}
