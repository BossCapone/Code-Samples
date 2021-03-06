/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatSystem;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author Eric
 */
public class ChatServer {

    public ChatServer(int port) throws IOException {
        ServerSocket server = new ServerSocket(port);
        while (true) {
            Socket client = server.accept();
            System.out.println("Accepted from " + client.getInetAddress());
            ChatHandler c = new ChatHandler(client);
            c.start();
        }
    }

    public static void main(String args[]) throws IOException {

        if (args.length != 1) {
            //throw new RuntimeException("Syntax: ChatServer <port>");
        }
        new ChatServer(Integer.parseInt("8014"));//args[0]
    }
}
