/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Qyo_J
 */
public class Test {
    public static void main(String[] args) {
        Semaphore semCajero;
        semCajero=new Semaphore(1);
        Cajero cajero=new Cajero();
        Cliente[] usuarios=new Cliente[100];
        for (int i = 0; i < 10; i++) {
            usuarios[i]=  new Cliente(semCajero,cajero);
            usuarios[i].start();
        }
    }
    
    
}
