/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Qyo_J
 */
public class Cajero {
    void depositar(int cantidad) throws InterruptedException
    {
          
        System.out.println("el unico cajero esta depositando "+ cantidad);
        sleep((long) (Math.random()%20000));
        System.out.println("termine la operacion depositar");
    }
    
    void retirar(int cantidad)throws InterruptedException
    {
        System.out.println("el unico cajero esta retirando "+ cantidad);
        sleep((long) (Math.random()%20000));
        System.out.println("termine la operacion retirar");
    }
   
    void getSaldo(int cuenta)throws InterruptedException
    {
        Random r=new Random();
        System.out.println("el saldo de la cuenta es "+ cuenta +"es:" + r.nextInt()%1000);
        sleep((long) (Math.random()%20000));
        System.out.println("termine la operacion obtener saldo");
    }
    
    void pagar(int cuenta ,int cantidad)throws InterruptedException
    {
        System.out.println("abonando "+ cantidad+ "a la cuenta"+ cuenta);
        sleep((long) (Math.random()%20000));
        System.out.println("termine la operacion pagar");
    }
}
