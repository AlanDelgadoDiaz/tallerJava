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
public class AirbusBuilder extends Builder
{

    @Override
    void buildAlas() 
    {
        Alas a = new Alas();
        a.setHiper(2);
        a.setMarca("WindsArmy");
        a.setNumSerie(8655);
        a.setSpoiler(4);
        avion.setAlas(a);
    }

    @Override
    void buildMotor() 
    {
        Motor m = new Motor();
        m.setNumSerie(8434);
        m.setPotencia(2345);
        avion.setMotor(m);
    }

    @Override
    void buildMarca() 
    {
        avion.setMarca("airbus");
    }

    @Override
    void buildNumSerie() 
    {
        avion.setNumSerie(8734);
    }

    @Override
    void buildModelo() 
    {
        avion.setModelo("er42");
    }
    
}
