/*
 * This class defines the different type of messages that will be 
 * exchanged between the Clients and the Server. 
 * When talking from a Java Client to a Java Server we will pass Java objects
 */
package ChatSystem;

import java.io.*;
/**
 *
 * @author Eric
 */
public class JChatMessage implements Serializable {
    
    
    /** The various message types sent by the client
     * WHOSONLINE - Recieves the list of users connected
     * MESSAGE - A regular message
     * LOGOUT - to disconnect from the server
     */
    static final int 
            WHOSONLINE = 0, 
            MESSAGE = 1, 
            LOGOUT = 2;
    private int type;
    private String message;

    public JChatMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }
    
    int getType() {
        return type;
    }
    
    String getMessage() {
        return message;
    }
}
