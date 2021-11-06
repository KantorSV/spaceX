package com.app.server;

import com.chat.tcp.common.ChatConnector;
import com.chat.tcp.common.ChatMessage;

import java.net.Socket;

public class ClientConnector extends ChatConnector {

    public ClientConnector(Socket client) {
        super(client);
    }

    @Override
    public void processChatMessage(ChatMessage chatMessage) {
        System.out.println("Client send message: "+chatMessage);
        ClientsDataModule.getInstance().sendMessageToAll(chatMessage);
    }
}
