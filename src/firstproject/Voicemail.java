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
public class Voicemail implements Contactable{

    @Override
    public void contact() {
        System.out.println("I took a message");
    }
    
}
