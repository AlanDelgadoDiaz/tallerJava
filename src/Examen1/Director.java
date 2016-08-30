/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

/**
 *
 * @author Qyo_J
 */
public class Director {
    Builder builder;
    
    
    
    public void setBuilder (Builder builder)
    {
        this.builder = builder;
    }
    
    
    
    public App getApp()
    {
       return builder.getApp();
    }
    
    public void buildApp()
    {
        builder.createApp();
        builder.buildJuegos();
        builder.buildFitness();
        builder.buildIdiomas();
        builder.buildMusica();
        
    }
    
      static Director getInstance()
    {
        if(singleton== null)
        {
            singleton=new Director();
        }
        
            return singleton;
        
    }
    private static Director singleton;
    
    
}
