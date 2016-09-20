/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromoMayor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qyo_J
 */
public class PalindromoMayor extends Thread{
    int mayor;

    public int getMayor() {
        return mayor;
    }
    int limInferior,limSuperior;

    public PalindromoMayor(int limInferior,int limSuperior, int mayor) {
        
        this.limInferior=limInferior;
        this.limSuperior=limSuperior;
        this.mayor=mayor;
    }
    
    
    
    boolean isPalindrome(Integer num)
    {
        String reverse=new String();
       String n=num.toString();
        for (int i = n.length()-1; i >=0; i--) {
            reverse= reverse + n.charAt(i);
        }
      if(reverse.equals(n))
        return true;
      return false;
    }
    
   

    @Override
    public void run() {
        for (int i = limInferior; i <= limSuperior; i++) {
            for (int j = 100; j < 10000; j++) {
                int temp=i*j;
                if(isPalindrome(temp))
                {
                    if(temp>mayor)
                    {
                        mayor=temp;
                    }
                }
            }
        }
        
    }
    
    
    
     public static void main(String[] args) {
         int mayor=0;
          PalindromoMayor []t=new PalindromoMayor[9];
         for (int i = 0; i < 9; i++) {
             
              
                  t [i] =new PalindromoMayor((i+1)*100,((i+1)*100)+99,mayor);
                  t[i].start();
             try {
                 t[i].join();
             } catch (InterruptedException ex) {
                 
             }
         }
         
         for (int i = 0; i < 9; i++) {
             
             if(t[i].getMayor() > mayor)
             {
                 mayor=t[i].getMayor();
             }
             
         }
         System.out.println("el mayor palindromo fue:"+ mayor);
         
        PalindromoMayor t1=new PalindromoMayor(100,199,mayor);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            
        }
        
         System.out.println("mayor:" + t1.getMayor() );
      
    }

   
     
    
}
