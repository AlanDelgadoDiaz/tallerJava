/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Qyo_J
 */
public class Laptop extends Computer {

    @Override
    public void configurar() {
        System.out.println("configurar Laptop");
    }

    @Override
    public void ensamblar() {
        System.out.println("ensamblando laptop");
    }

    @Override
    public void instalarS() {
        System.out.println("instalacion de software de laptop");
    }

    @Override
    public void embalar() {
        System.out.println("embalar laptop"); 
    }
    
}
