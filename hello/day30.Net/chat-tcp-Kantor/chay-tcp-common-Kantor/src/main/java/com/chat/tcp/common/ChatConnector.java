package com.chat.tcp.common;

import java.net.Socket;

public abstract class ChatConnector extends Thread implements Connector {

    private Socket socket;

    public ChatConnector(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        while (true) {
            ChatMessage chatMessage = readMessage();
            processChatMessage(chatMessage);
        }
    }

    public abstract void processChatMessage(ChatMessage chatMessage);

    public void writeMessage(ChatMessage chatMessage) {
        Utils.writeMessage(socket, chatMessage);
    }

    public ChatMessage readMessage() {
        return Utils.readMessage(socket);
    }

    public void startWorking() {
        start();
    }
}
