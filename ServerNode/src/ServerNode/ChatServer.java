package ServerNode;


import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmlb
 */
public class ChatServer extends UnicastRemoteObject implements ChatServerInt {

    private Vector v = new Vector();

    public ChatServer() throws RemoteException {
    }

    public boolean login(ChatClientInt a) throws RemoteException {
        System.out.println(a.getName() + "  se ha conectado....");
        a.tell("Conectado con éxito.", "System");
        publish(a.getName() + " se ha conectado.", a.getName());
        v.add(a);
        return true;
    }

    public void publish(String s, String name) throws RemoteException {
        System.out.println(s + "->" + name);
        for (int i = 0; i < v.size(); i++) {
            try {
                ChatClientInt tmp = (ChatClientInt) v.get(i);
                tmp.tell(s, name);
            } catch (Exception e) {
		   
            }
        }
    }

    public Vector getConnected() throws RemoteException {
        return v;
    }
}
