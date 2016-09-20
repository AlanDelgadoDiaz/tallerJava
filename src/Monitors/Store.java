/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Qyo_J
 */
public class Store {
    
    Lock lock;
    Condition isFull;
    Condition isEmpty;
    Vector<Integer> v;
    int count=0;

    public Store() {
        lock=new ReentrantLock();
        isFull=lock.newCondition();
        isEmpty=lock.newCondition();
        
        v=new  Vector<Integer>();
        v.setSize(10);
    }
    
    public void produce ()
    {
      lock.lock();
      //este es el codigo que solo puede generar un hilo bajo ciertas 
      
      try{
      while(count==10)
              {
                  isFull.await();
              }
      
      Random r=new Random();
    Integer temp=new Integer(r.nextInt()%100);
    v.add(temp);
      System.out.println("se produjo un" + temp.toString());
      count++;
      isEmpty.signal();
      
      }catch(InterruptedException e)
                      {
                      System.out.println(e.toString());
                      }
        finally
      {
          lock.unlock();
      }
      
    
    }
    
    public Integer consume()
    {
       Integer temp =0;
      lock.lock();
      try
      {
          while(count==0)
          {
              isEmpty.await();
          }
          temp=v.lastElement();
          System.out.println("consumidor consumio un:" + temp);
         
          v.remove(count);
          isFull.signal();
          count--;
          isFull.signal();
          
      }catch(InterruptedException e)
      {
          System.out.println(e.toString());
      }
      finally
      {
          lock.unlock();
          return temp;
      }
    }

    

    
    
    
}
