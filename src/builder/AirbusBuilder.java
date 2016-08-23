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
public class AirbusBuilder extends Builder {

    @Override
    void buildAlas() {
        Alas a=new Alas();
        a.setHiper(2);
        a.setMarca("WindArmy");
        a.setNumSerie(123123);
        a.setSpoiler(4);
        avion.setAlas(a);
      
    }

    @Override
    void buildMotor() {
        Motor m=new Motor();
        m.setNumserie(1132432);
        m.setPotencia(1000);
        avion.setMotor(m);
       
    }

    @Override
    void buildMarca() {
       avion.setMarca("Airbus");
    }

    @Override
    void buildNumSerie() {
        avion.setNumserie(12341234);
    }

    @Override
    void buildModelo() {
       avion.setModelo("a380");
    }
    
}
