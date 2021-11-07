package com.app.server;

import com.chat.tcp.common.ChatMessage;
import com.chat.tcp.common.Connector;

import java.util.ArrayList;
import java.util.List;

public class ClientsDataModule {

    private List<Connector> clients = new ArrayList<>();
    private static ClientsDataModule inst = new ClientsDataModule();

    private ClientsDataModule() {
    }

    public void add(Connector client) {
        clients.add(client);

    }

    public void remove(Connector connector) {
        clients.remove(connector);
    }

    public void removeAll() {
        clients.clear();
    }

    public int clientsCount() {
        return clients.size();
    }

    public void sendMessageToAll(ChatMessage chatMessage) {
        for (int i = 0; i < clients.size(); i++) {
            Connector client = clients.get(i);
            client.writeMessage(chatMessage);
        }
    }

    public static ClientsDataModule getInstance() {
        return inst;
    }
}
