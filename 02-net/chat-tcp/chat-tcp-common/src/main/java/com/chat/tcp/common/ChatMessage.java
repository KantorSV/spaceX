package com.chat.tcp.common;

import java.io.Serializable;

public class ChatMessage implements Serializable {

    private String message;
    private String userName;
    private long timestamp;

    public ChatMessage(String message, String userName, long timestamp) {
        this.message = message;
        this.userName = userName;
        this.timestamp = timestamp;
    }

    public ChatMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "message='" + message + '\'' +
                ", userName='" + userName + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
