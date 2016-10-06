/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilosofoAriel;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qyo_J
 */
public class Test extends Thread{
    
    Semaphore mesa;
    Semaphore cuchillo;
    Semaphore tenedor;
    int id;

    public Test(Semaphore mesa, Semaphore cuchillo, Semaphore tenedor, int id) {
        this.cuchillo = cuchillo;
        this.tenedor = tenedor;
        this.id = id;
        this.mesa= mesa;
    }

    @Override
    public void run() {
      while (true)
              {
          try {
              mesa.acquire();
              System.out.println("soy el filosofo"+ id + "y estoy comiendo en la mesa");
              cuchillo.acquire();
              System.out.println("filosofo"+ id + "obtuve el cuchillo");
              tenedor.acquire();
              System.out.println("filosofo" + id+ "obtuve el tenedor");
              
              comer();
              
              tenedor.release();
              cuchillo.release();
              mesa.release();
          } catch (InterruptedException ex) {
              System.out.println("la excepcion" + ex.toString());
          }
              }
    }

    private void comer() {
        try {
            System.out.println("soy el filosofo" + id + "estoy comiendo");
            sleep((long) (Math.random()%15000+15));
            System.out.println("soy el filosofo" + id + "termine de comer");
        } catch (InterruptedException ex) {
           
        }
    }
    
    
    
}
