/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilosofoAriel;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Qyo_J
 */
public class Main {

    public static void main(String[] args) {
        Semaphore cuchillo;
        Semaphore tenedor;
        Semaphore mesa;
        
        cuchillo =new Semaphore (3);
        tenedor =new Semaphore (3);
        mesa=new Semaphore(4);
        
        Test [] ps= new Test[15];
        
        for (int i = 0; i < 15; i++) {
            ps[i]=new Test(mesa,cuchillo,tenedor, i+1);
            ps[i].start();
            
            
        }

    }

}
