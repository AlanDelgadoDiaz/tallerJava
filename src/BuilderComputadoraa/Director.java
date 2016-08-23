/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderComputadoraa;

/**
 *
 * @author Qyo_J
 */
public class Director {
     Builder builder;
        
       Computadora getComputadora()
       {
           return builder.getComputadora();
       }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
 
    
    
    void buildComputadora()
    {
        builder.createComputadora();
        builder.buildDisco();
        builder.buildMonitor();
        builder.buildRam();
        builder.buildTeclado();
        builder.buildProcesador();
        
    }  
          
    
}
