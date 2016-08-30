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
public class Juegos extends AppFactory  {
     
    private String name;
    private int memoria;
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    protected void concepcion() {
        System.out.println("concepcion juegos");
    }

    @Override
    protected void diseño() {
        System.out.println("diseñar juegos");
    }

    @Override
    protected void planificacion() {
        System.out.println("planificacion juegos");
    }

    @Override
    protected void produccion() {
        System.out.println("produccion juegos");
    }

    @Override
    protected void pruebas() {
        System.out.println("pruebas juegos");
    }

  
}
