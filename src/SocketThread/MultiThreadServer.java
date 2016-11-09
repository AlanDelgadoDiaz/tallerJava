/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qyo_J
 */
public class MultiThreadServer {
    
    public static final int port=19999;
    
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(port);
            
            Socket connection;
            
            while(true)
            {
                System.out.println("servidor esperando conexiones");
                connection=ss.accept();
                System.out.println("servidor recibio un cliente");
                ProcesRequest request=new  ProcesRequest(connection);
                Thread t=new Thread(request);
                t.start();
            }
        } catch (IOException ex) {
            
        }
        
    }
    
}
