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
public class Fitness extends AppFactory {
    
     private String name;
    private int memoria;
    private int precio;

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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    protected void concepcion() {
        System.out.println("concepcion fitness");
    }

    @Override
    protected void diseño() {
        System.out.println("diseñar fitness");
    }

    @Override
    protected void planificacion() {
        System.out.println("planificacion fitness");
    }

    @Override
    protected void produccion() {
        System.out.println("produccion fitness");
    }

    @Override
    protected void pruebas() {
        System.out.println("pruebas fitness");
    }

}
