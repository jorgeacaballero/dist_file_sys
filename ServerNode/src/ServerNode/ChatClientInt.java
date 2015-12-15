package ServerNode;


import java.rmi.*;

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

    public void tell(String mensaje, String nombre) throws RemoteException;

    public String getName() throws RemoteException;
}
