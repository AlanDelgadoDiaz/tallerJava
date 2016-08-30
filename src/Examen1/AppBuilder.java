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
public class AppBuilder extends Builder{

    @Override
    void buildJuegos() {
        Juegos juegos=new Juegos();
        juegos.setMemoria(20);
        juegos.setName("king kong");
        juegos.setTipo("accion");
        app.setJuegos(juegos);
    }

    @Override
    void buildFitness() {
        Fitness fitness=new Fitness();
        fitness.setMemoria(12);
        fitness.setName("muevete,midete");
        fitness.setPrecio(10000);
        app.setFitness(fitness);
        
        
    }

    @Override
    void buildIdiomas() {
        Idiomas idiomas=new Idiomas();
        idiomas.setMemoria(30);
        idiomas.setName("diccionario");
        idiomas.setPrecio(6000);
        app.setIdiomas(idiomas);
       
    }

    @Override
    void buildMusica() {
        Musica musica=new Musica();
        musica.setGenero("de tocho");
        musica.setMemoria(80);
        musica.setName("musica siempre");
        app.setMusica(musica);
        
        
        
      
    }
    
    
}
