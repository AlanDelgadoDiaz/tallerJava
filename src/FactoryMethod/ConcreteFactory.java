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
public class ConcreteFactory extends Factory {

    @Override
    public Computer factoryMethod(String tipoCompu) {
        Computer c;
        switch (tipoCompu) 
        {
            case  "laptop":
                c =new Laptop();
                break;
                 case  "Desktop":
                c=new Desktop();
                break;
                 case  "Netbook":
                c=new Netbook();
                break;
                 default:
                     c=null;
                     break;
                
        }
        return c;

    }

}
