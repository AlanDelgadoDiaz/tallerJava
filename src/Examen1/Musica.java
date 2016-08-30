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
public class Musica extends AppFactory {
     private String name;
    private int memoria;
    private String  genero;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    protected void concepcion() {
        System.out.println("concepcion musica");
    }

    @Override
    protected void diseño() {
        System.out.println("diseñar musica");
    }

    @Override
    protected void planificacion() {
        System.out.println("planificacion musica");
    }

    @Override
    protected void produccion() {
        System.out.println("produccion musica");
    }

    @Override
    protected void pruebas() {
        System.out.println("pruebas musica");
    }
    
}
