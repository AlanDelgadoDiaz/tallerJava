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
public abstract class Builder 
{

    protected Avion avion;
    
    public Avion getAvion()
    {
        return avion;
    }
    
    public void createAvion()
    {
        avion = new Avion();
    }
    
    abstract void buildAlas();
    abstract void buildMotor();
    abstract void buildMarca();
    abstract void buildNumSerie();
    abstract void buildModelo();
}
