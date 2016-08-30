/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import Iterator.Iterator;

/**
 *
 * @author Qyo_J
 */
public class TestApp {
    
     public static void main(String[] args) 
    {
        
        ListaApp lista=new ListaApp();
        
        Director d = Director.getInstance();
        
        ConcreteApp cf =new ConcreteApp();
    Juegos l= (Juegos)cf.createApp("Juegos");
        
        d.setBuilder(new AppBuilder());
        d.buildApp();
        App miAppJuego= d.getApp();
        System.out.println("el nombre de mi juego de la app es: " + miAppJuego.getJuegos().getName());
        
        lista.add(miAppJuego);
        
         for (Iterator i = lista.createIterator(); i.isDone();)
        {
            App a = (App)i.next();
            System.out.println("App:" + a.getJuegos().getName());
        }
        
      
    }
    
}
