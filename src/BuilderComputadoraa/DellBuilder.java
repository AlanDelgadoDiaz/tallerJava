/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderComputadoraa;

/**
 *
 * @author Qyo_J
 */
public class DellBuilder extends Builder{

   

    @Override
    void buildDisco() {
        DiscoDuro disco=new DiscoDuro();
        disco.setCapacidad(500);
        disco.setEstado("solido");
        disco.setModelo("patito");
        
        
        
    }

    @Override
    void buildRam() {
        MemoriaRAM ram =new MemoriaRAM();
        ram.setCapacidad(16);
        ram.setModelo("chido");
    }

    @Override
    void buildMonitor() {
       Monitor monitor =new Monitor();
       monitor.setMarca("sony");
       monitor.setPulgadas(13);
       monitor.setTipo("plasma");
    }

    @Override
    void buildProcesador() {
      Procesador procesador=new Procesador();
      procesador.setCapacidad(2);
      procesador.setMarca("sony");
      procesador.setModelo("ah1n1");
      
    }

    @Override
    void buildTeclado() {
      Teclado teclado=new Teclado();
      teclado.setColor("rosa");
      teclado.setMarca("vaio");
      
    }
    
}
