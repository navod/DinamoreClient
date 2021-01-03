/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Orders;
import observer.ChefObserver;
import view.SuperChef;

/**
 *
 * @author kushantha
 */
public class ChefObserverImpl extends UnicastRemoteObject implements ChefObserver{
    private SuperChef superChef;
    public ChefObserverImpl(SuperChef superChef) throws RemoteException{
        this.superChef = superChef;
    }
    @Override
    public void set(int orders) throws RemoteException {
        superChef.setOrders(orders);
    }

    @Override
    public void setOrder(Orders order) throws RemoteException {
        superChef.order(order);
    }

    @Override
    public void noOrders() throws RemoteException {
        superChef.order(null);
    }
    
}
