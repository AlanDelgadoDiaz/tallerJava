/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketThread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qyo_J
 */
public class ProcesRequest implements Runnable {

    
    Socket connection;
    StringBuffer sb; 
    
    ProcesRequest(Socket connection) {
        this.connection= connection;
        sb=new StringBuffer();
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis=new BufferedInputStream(connection.getInputStream());
            InputStreamReader isr=new InputStreamReader(bis);
            
            BufferedOutputStream bos=new BufferedOutputStream(connection.getOutputStream());
            OutputStreamWriter osw=new OutputStreamWriter(bos);
            
            int caracter;
            while((caracter = isr.read()) != (char)13)
            {
                sb.append(caracter);
            }
            
            System.out.println("el servidio recibio" + sb);
            
            
            sb.delete(0, sb.length());
            
            sb.append("el servidor dicen:traigan un verdadero admin" + (char) 13);
            osw.write(sb.toString());
            osw.flush();
            
            connection.close();
            
            
        } catch (IOException ex) {
            
        }
    }
    
}
