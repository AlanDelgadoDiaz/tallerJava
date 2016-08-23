/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Qyo_J
 */
public class Director {

    
        Builder builder;
        
       Avion getAvion()
       {
           return builder.getAvion();
       }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
 
    
    
    void buildAvion()
    {
        builder.createAvion();
        builder.buildAlas();
        builder.buildMarca();
        builder.buildModelo();
        builder.buildNumSerie();
        builder.buildMotor();
        
    }  
          
    
}
