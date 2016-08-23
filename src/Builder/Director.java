/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Carlos
 */
public class Director 
{
    Builder builder;
    public void setBuilder (Builder builder)
    {
        this.builder = builder;
    }
    
    
    
    public Avion getAvion()
    {
       return builder.getAvion();
    }
    
    public void buildAvion()
    {
        builder.createAvion();
        builder.buildAlas();
        builder.buildModelo();
        builder.buildMarca();
        builder.buildNumSerie();
        builder.buildMotor();
    }
    
}
