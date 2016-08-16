/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import SingleTon.Clock;

/**
 *
 * @author Qyo_J
 */
public abstract class Factory {
    
    protected abstract Computer factoryMethod(String tipoCompu);
    
    public Computer createCompu(String tipoCompu)
    {
        Computer c = factoryMethod(tipoCompu);
        c.configurar();
        c.ensamblar();
        c.instalarS();
        c.embalar();
        return c;
        
    }
    
    static Factory getInstance()
    {
        if(singleton== null)
        {
            singleton=new Factory() {
                @Override
                protected Computer factoryMethod(String tipoCompu) {
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
            };
        }
        
            return singleton;
        
    }
    private static Factory singleton; 
    
}
