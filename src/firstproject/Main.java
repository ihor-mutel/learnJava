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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        m.run();
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
        
        while (p.getAge() < 42) {
            System.out.println(p.getFullName() +" ; Age: " + p.getAge()); 
            p.birthday();
        }
      

    }
}
