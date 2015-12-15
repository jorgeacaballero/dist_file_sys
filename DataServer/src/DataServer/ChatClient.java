package DataServer;


import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmlb
 */

public class ChatClient extends UnicastRemoteObject implements ChatClientInt {

    private String nombre;
    private Chat chat;

    public void setGUI(Chat cosita) {
        chat = cosita;
    }
    
    public ChatClient(String nombree) throws RemoteException {
        nombre = nombree;
    }
    
    public String getName() throws RemoteException {
        return nombre;
    }

    public void tell(String mensaje, String name) throws RemoteException {
        System.out.println(mensaje + "->" + name);
        chat.writeMsg(mensaje, name);
    }

    

    
}
