/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import Controller.ChefController;
import Controller.TPOperatorController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author kushantha
 */
public class ServerConnector {

    private static ServerConnector serverConnector;
    private TPOperatorController tPOperatorController;
    private ChefController chefController;

    public ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
       this.tPOperatorController = (TPOperatorController) Naming.lookup("rmi://localhost:5050/Dinamore");
       this.chefController = (ChefController) Naming.lookup("rmi://localhost:5050/Dinamore");
    }

    public static ServerConnector getInstance() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }
    public TPOperatorController getTPOperatorController(){
        return this.tPOperatorController;
    }
    public ChefController getChefController(){
        return this.chefController;
    }
}
