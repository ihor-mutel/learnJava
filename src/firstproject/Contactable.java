/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author The Revenant
 */
public interface Contactable {
    public void contact();
    
    public default void callTwice(){
        contact();
        contact();
    }
}
