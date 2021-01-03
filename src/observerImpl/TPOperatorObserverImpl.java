/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observer.TPOperatorObserver;
import view.SuperTPOperator;

/**
 *
 * @author kushantha
 */
public class TPOperatorObserverImpl extends UnicastRemoteObject implements TPOperatorObserver{
    private SuperTPOperator superTPOperator;
    
     public TPOperatorObserverImpl(SuperTPOperator superTPOperator) throws RemoteException {
        this.superTPOperator = superTPOperator;
    }
    
    
    @Override
    public void orderId(String orderId) throws RemoteException {
        superTPOperator.getOrderId(orderId);
    }
    
}
