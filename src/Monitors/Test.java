/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

/**
 *
 * @author Qyo_J
 */
public class Test {
    public static void main(String[] args) {
        Store store=new Store();
        Thread[] p=new Producer[10];
          Thread[] c=new Consume[10];
        
        for (int i = 0; i < 10; i++) {
            p[i] =new Producer(store);
            c[i]=new Consume(store);
            p[i].start();
            c[i].start();
        }
    }
    
}
