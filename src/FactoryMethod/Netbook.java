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
public class Netbook extends Computer{
    
    @Override
    public void configurar() {
        System.out.println("configurar Netbook");
    }

    @Override
    public void ensamblar() {
        System.out.println("ensamblando Netbook");
    }

    @Override
    public void instalarS() {
        System.out.println("instalacion de software de Netbook");
    }

    @Override
    public void embalar() {
        System.out.println("embalar Netbook"); 
    }
}
