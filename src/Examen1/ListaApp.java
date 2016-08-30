/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import Iterator.Aggregate;
import Iterator.Iterator;

/**
 *
 * @author Qyo_J
 */
public class ListaApp implements Aggregate{
    
     private App[] app;
    private int numApps;
    private int size=10;
    
    
    public ListaApp()
    {
        app = new App[size]; 
    }
    
    public void add(App aplicacion)
    {
        app[numApps++] = aplicacion;
    }

   
    @Override
    public Iterator createIterator() 
    {
        return new ConcreteIterator();
    }
    
    class ConcreteIterator implements Iterator
    {
        
        int index = 0;

        @Override
        public Object first() 
        {
            return app[0];
        }

        @Override
        public Object next() 
        {
            if(isDone())
            {
                return app[index++];
            }
            return null;
        }

        @Override
        public boolean isDone() 
        {
            if(index >= numApps)
            {
                return false;
            }
            return true;
        }

        @Override
        public Object currentItem() 
        {
          return app[index];  
        }
        
    }
}
