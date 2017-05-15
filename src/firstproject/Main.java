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
        Person p = new Person();
        p.setFirstName("Ben");
        p.setLastName("Evans");
        p.setAge(21);

        Person mum = new Person();
        mum.setFirstName("Sue");
        mum.setLastName("Evans");
        p.setMother(mum);
                
        
        AGE: while (p.getAge() < 55) {
            switch(p.getAge()){
                case 40:
                   System.out.println(p.getFullName() +" - Signficant birthday: " + p.getAge() );
                   break;
                case 50:
                   System.out.println(p.getFullName() +" - Signficant birthday: " + p.getAge() );
                   break AGE;
            }
            p.birthday();
        }
        //for (int i=0; i<40; i++) {
        //    System.out.println(Math.random());
        //}
        
        //System.out.println(1 + Integer.parseInt("42"));
        System.out.println(p);
        
        int[] ages = {14, 22, 37, 47};
        
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[1]);
    }

    
}
