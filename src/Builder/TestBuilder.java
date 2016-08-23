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
public class TestBuilder 
{

    public static void main(String[] args) 
    {
        Director d = new Director();
        d.setBuilder(new BoeingBuilder());
        d.buildAvion();
        Avion miAvionBoeing = d.getAvion();
        System.out.println("La marca de mi avion: " + miAvionBoeing.getMarca());
        
        d.setBuilder(new AirbusBuilder());
        d.buildAvion();
        Avion miAirbus = d.getAvion();
        
        System.out.println("Mi nuevo avion es un" + miAirbus.getModelo());
    }
    
}
