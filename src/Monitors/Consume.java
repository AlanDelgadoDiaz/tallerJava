/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Qyo_J
 */
public class Consume extends Thread {
    
     protected Store store;

    public Consume(Store store) {
        this.store = store;
    }
    
    

    @Override
    public void run() {
        try
        {
        while(true)
        {
            store.consume();
            Random r=new Random();
            int temp = r.nextInt()%20000+19000;
            sleep(temp>=0 ? temp: (temp*-1));
        }
        } catch(InterruptedException e)
                {
                System.out.println();
                }
        }
    
}
