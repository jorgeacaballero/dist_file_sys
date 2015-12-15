package DataServer;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jmlb
 */
public interface ChatClientInt extends Remote {

    public String getName() throws RemoteException;
    
    public void tell(String mensaje, String name) throws RemoteException;
    
}
