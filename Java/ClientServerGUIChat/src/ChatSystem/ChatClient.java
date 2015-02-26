/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatSystem;

import java.awt.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author Eric Virgil,
 *
 * This class implements the chat client. This involves setting up a UI,
 * handling user interaction, and recieving messages from the server.
 *
 * The client implements runnable interface so we can start a thread that
 * recieves messages from the server.
 */
public class ChatClient extends Frame implements Runnable {

    
    protected DataInputStream i;
    protected DataOutputStream o;
    protected TextArea output;
    protected TextField input;
    protected Thread listener;

    //Additional params
    private String login;
    private String sendTo;
    
    
    public ChatClient(String title, InputStream i, OutputStream o) {
        super(title);
        this.i = new DataInputStream(new BufferedInputStream(i));
        this.o = new DataOutputStream(new BufferedOutputStream(o));
        setLayout(new BorderLayout());
        add("Center", output = new TextArea());
        output.setEditable(false);
        add("South", input = new TextField());
        pack();
        show();
        input.requestFocus();
        listener = new Thread(this);
        listener.start();

    }

    @Override
    public void run() {
        try {
            while (true) {
                String line = i.readUTF();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            listener = null;
            input.setVisible(false);
            validate();
            try {
                o.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public boolean handleEvent(Event e) {
        if ((e.target == input) && (e.id == Event.ACTION_EVENT)) {
            try {
                o.writeUTF((String) e.arg);
                o.flush();
            } catch (Exception ev) {
                ev.printStackTrace();
                listener.stop();
            }
            input.setText("");
            return true;
        } else if ((e.target == this) && (e.id == Event.WINDOW_DESTROY)) {
            if (listener != null) {
                listener.stop();
            }
            setVisible(false);
        }
        return super.handleEvent(e);
    }

    public static void main(String args[]) throws IOException {
        if (args.length != 2) {
            //throw new RuntimeException("Syntax: ChatClient <host> <port>");
        }

        Socket s = new Socket("127.0.0.1", 8014);
        new ChatClient("Chat " + "127.0.0.1" + ":" +8014, s.getInputStream(), s.getOutputStream());
//        Socket s = new Socket(args[0], Integer.parseInt(args[1]);
//        new ChatClient("Chat " + args[0] + ":" + args[1], s.getInputStream(), s.getOutputStream());

    }

}
