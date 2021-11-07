package com.app.client;

import com.chat.tcp.common.ChatMessage;

import java.util.Date;

public class Utils {

    public static ChatMessage createMessage(String text, String userName){

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage(text);
        chatMessage.setTimestamp(System.currentTimeMillis());
        chatMessage.setUserName(userName);
        return chatMessage;
    }

    public static String createText(ChatMessage chatMessage){

        String message = chatMessage.getMessage();
        String usernameMessage = chatMessage.getUserName();
        long ts = chatMessage.getTimestamp();
        Date date = new Date(ts);
        String result = date + "  " + usernameMessage + "  " + message;
        return result;
    }
}
