package ServerNode;


import java.rmi.*;
import java.rmi.server.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmlb
 */
public class StartServer {

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            ChatServerInt b = new ChatServer();
            Naming.rebind("rmi://127.0.0.1/myabc", b);
            System.out.println("[Sistema] Servidor de chat está listo.");
        } catch (Exception e) {
            System.out.println("Servidor de chat ha fallado: " + e);
        }
    }
}
