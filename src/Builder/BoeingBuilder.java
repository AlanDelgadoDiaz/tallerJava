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
public class BoeingBuilder extends Builder
{

    @Override
    void buildAlas() 
    {
        Alas alas = new Alas();
        alas.setHiper(5);
        alas.setMarca("Windstore");
        alas.setNumSerie(1234);
        alas.setSpoiler(10);
        avion.setAlas(alas);
    }

    @Override
    void buildMotor() 
    {
        Motor motor = new Motor();
        motor.setNumSerie(4678);
        motor.setPotencia(1000);
        avion.setMotor(motor);
    }

    @Override
    void buildMarca() 
    {
        avion.setMarca("Boeing");
    }

    @Override
    void buildNumSerie() 
    {
        avion.setNumSerie(3456);
    }

    @Override
    void buildModelo() 
    {
        avion.setModelo("417");
    }
    
    
    
}
