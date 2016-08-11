/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTon;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Qyo_J
 */
public class Clock {

    public Date getTime() {
        
        Calendar c = Calendar.getInstance();    
        Date d= c.getTime();
        System.out.println("la fecha y la hora son:");
        System.out.println(d.toString());        
        return d;   
    }
    
    private Clock()
    {
        
    }
    
     static Clock getInstance()
    {
        if(singleton== null)
        {
            singleton=new Clock();
        }
        
            return singleton;
        
    }
    private static Clock singleton;
    
  
        
    }
     

