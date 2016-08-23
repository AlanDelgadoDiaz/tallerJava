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
public class Avion 
{
    private String marca;
    private String modelo;
    private int numSerie;
    private Motor motor;
    private Alas alas;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setAlas(Alas alas) {
        this.alas = alas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public Motor getMotor() {
        return motor;
    }

    public Alas getAlas() {
        return alas;
    }
    
    
}
