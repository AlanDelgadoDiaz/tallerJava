/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import java.util.Random;

/**
 *
 * @author Qyo_J
 */
public class Producer extends Thread {
    
    protected Store store;

    public Producer(Store store) {
        this.store = store;
    }
    
    

    @Override
    public void run() {
        try
        {
        while(true)
        {
            store.produce();
            Random r=new Random();
            int temp=r.nextInt()%10000+1000;
            sleep(temp>=0 ? temp: (temp*-1));
        }
        } catch(InterruptedException e)
                {
                System.out.println();
                }
        }
    
    
    
    
    }
    

