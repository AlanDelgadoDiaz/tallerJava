/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofo;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Qyo_J
 */
public class Filosofo extends Thread {
 
   
    private final int idFilosofo;
 
    private final Semaphore[] palillos_semaforo;
    private final int[][] palillosFilosofo;
    private final int palilloIzquierdo; 
    private final int palilloDerecho;
 
   
    private final Random tiempoAleatorio = new Random();
 
    /**
     * Constructor de tres parámetros, cada uno de los cuales se guardará en una
     * variable local para usarla cuando sea necesario.
     *
     * @param idFilosofo int: índice que identifica a cada filósofo (entero del
     * 0 al 4).
     * @param palillos_semaforo Semaphore[]: array de semáforos, uno por cada
     * palillo.
     * @param palillosFilosofo int[][]: array de enteros 2 dimensiones. Por cada
     * valor de su primer índice (filas) almacena los palillos que necesita el
     * filósofo de ese índice para comer. Por ejemplo: el filósofo de índice 0
     * necesita los palillos de índices {0,4}, el de índice 1 los de índices
     * {1,0}, etc...
     */
    public Filosofo(int idFilosofo, Semaphore[] palillos_semaforo, int[][] palillosFilosofo) {
        this.idFilosofo = idFilosofo;
        this.palillos_semaforo = palillos_semaforo;
        this.palillosFilosofo = palillosFilosofo;
        this.palilloIzquierdo = palillosFilosofo[idFilosofo][0];
        this.palilloDerecho = palillosFilosofo[idFilosofo][1];
    }
 
   
    protected void comer() {
       
        if (palillos_semaforo[palilloIzquierdo].tryAcquire()) {
            if (palillos_semaforo[palilloDerecho].tryAcquire()) {
                System.out.println("FILÓSOFO " + idFilosofo + " ESTÁ COMIENDO.");
                try {
                   
                    sleep(tiempoAleatorio.nextInt(1000) + 500);
                } catch (InterruptedException ex) {
                    System.out.println("Error : " + ex.toString());
                }
                System.out.println("Filósofo " + idFilosofo + " ha terminado de comer.Libera los palillos " + palilloIzquierdo + " y " + palilloDerecho);
            
                palillos_semaforo[palilloDerecho].release();
            }
            // Y libera también el semáforo palillo de su izuierda.
            palillos_semaforo[palilloIzquierdo].release();
        } else { // el filósofo no ha podido coger el pallillo, no puede comer.
            System.out.println("Filósofo " + idFilosofo + " está hambriento.");
        }
    }
 
    
    protected void pensar() {
        System.out.println("Filósofo " + idFilosofo + " está pensando.");
        try {
            // El tiempo que tarda el filósofo en pensar, entre 100 y 1000 milisegundos:
            Filosofo.sleep(tiempoAleatorio.nextInt(1000) + 100);
        } catch (InterruptedException ex) {
            System.out.println("Error en el método pensar(): " + ex.toString());
        }
    }
 
   
    @Override
    public void run() {
        while (true) {
            pensar();
            comer();
        }
    }
}
