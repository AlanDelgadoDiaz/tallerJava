/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Qyo_J
 */
public class Desktop extends Computer{
     @Override
    public void configurar() {
        System.out.println("configurar Desktop");
    }

    @Override
    public void ensamblar() {
        System.out.println("ensamblando Desktop");
    }

    @Override
    public void instalarS() {
        System.out.println("instalacion de software de Desktop");
    }

    @Override
    public void embalar() {
        System.out.println("embalar Desktop"); 
    }
    
}
