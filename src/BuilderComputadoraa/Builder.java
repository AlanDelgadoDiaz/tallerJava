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
public abstract class Builder {

  
    
     protected Computadora computadora;
    
      public void createComputadora()
      {
          computadora=new Computadora();
      }
      
      
      abstract void buildDisco();
      abstract void buildRam();
      abstract void buildMonitor();
      abstract void buildProcesador();
      abstract void buildTeclado();

        public Computadora getComputadora() {
        return computadora;
    }
 
}
