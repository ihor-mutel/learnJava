/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author The Revenant
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Main m = new Main();
        m.run();
        System.in.read();

        
    }

    private void run() {
        Person ben = new Person();
        ben.setFirstName("Ben");
        ben.setLastName("Evans");
        ben.setAge(38);

        Person mum = new Person();
        mum.setFirstName("Sue");
        mum.setLastName("Evans");
        mum.setAge(67);
        
        ben.setMother(mum);
                
        Person dad = new Person();
        dad.setFirstName("Martian");
        dad.setLastName("Evans");
        dad.setAge(68);
        
        Person[] myFamaly = {ben, mum, dad};
        System.out.println(Arrays.toString(myFamaly));
        
        double ave = 0.0;
        
        for (Person p : myFamaly) {
            ave += p.getAge();
        }
        ave = ave / myFamaly.length;
        System.out.println(ave);
    }

    
}
