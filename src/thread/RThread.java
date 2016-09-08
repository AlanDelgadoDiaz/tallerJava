/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Qyo_J
 */
public class RThread implements Runnable {

    private int id;

    public RThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("soy el hilo:" + id);
    }

    public static void main(String[] args) {
        RThread t1 = new RThread(1);
        RThread t2 = new RThread(2);
        RThread t3 = new RThread(3);
        RThread t4 = new RThread(4);

        Thread h1 = new Thread(t1);
        Thread h2 = new Thread(t2);
        Thread h3 = new Thread(t3);
        Thread h4 = new Thread(t4);
        
        h4.setPriority(1);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

    }

}
