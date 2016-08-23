/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author administrador1
 */
public class ConcreteAggregate implements Aggregate{
    private String[] palabras;
    private int numPalabras=0;
    private int size=10;
    
    public ConcreteAggregate() 
    {
        palabras = new String[size];        
    }
    
    public void add(String palabra)
    {
        palabras[numPalabras++] = palabra;        
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
        public Object first() {
            return palabras[0];
        }

        @Override
        public Object next() {
            if(isDone())
            {
                return palabras[index++];
            }            
            return null;
        }

        @Override
        public boolean isDone() {  // hasNext()
            if(index >= numPalabras)
            {
                return false;
            }
            return true;
        }

        @Override
        public Object currentItem() {
            return palabras[index];
        }
        
    }    
}
