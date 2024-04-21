package com.blitzhetz.server;

import com.blitzhetz.client.ChattyClient;

public class ChattyServer {
    public static void main(String[] args) {
        ChattyClient client = new ChattyClient();
        System.out.println(client.message("Hello, World!"));
    }
}
