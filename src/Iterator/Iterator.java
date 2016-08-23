/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author administrador1
 */
public interface Iterator {
    public Object first();
    public Object next();
    public boolean isDone();
    public Object currentItem();
}
