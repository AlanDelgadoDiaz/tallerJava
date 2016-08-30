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
public  abstract class Factory {
    
       protected abstract AppFactory factoryMethod(String tipoApp);
    
    public AppFactory createApp(String tipoApp)
    {
        AppFactory c = factoryMethod(tipoApp);
       c.concepcion();
       c.diseño();
       c.planificacion();
       c.produccion();
       c.pruebas();
        return c;
        
    }
    
    static Factory getInstance()
    {
        if(singleton== null)
        {
            singleton=new Factory() {
                @Override
                protected AppFactory factoryMethod(String tipoApp) {
                    AppFactory c;
        switch (tipoApp) 
        {
            case  "Juegos":
                c =new Juegos();
                break;
                 case  "Fitness":
                c=new Fitness();
                break;
                 case  "Idiomas":
                c=new Idiomas();
                break;
                case  "Musica":
                c =new Musica();
                break;
                 default:
                     c=null;
                     break;
                
        }
        return c;
                }
            };
        }
        
            return singleton;
        
    }
    private static Factory singleton; 
    
    
    
}
