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
//        p.setFirstName("Ben");
        p.setLastName("Evans");
        int i = 234;
        double d = 54.25;
        boolean b = true;
        char c = 'X';
        
        //c = false;
        b = 'Z';
        
        
        System.out.println(p.getFullName() +" ; Age: " + p.getAge());        
        p.setAge(14);
        System.out.println(p.getFullName() +" ; Age: " + p.getAge()); 
    }
}
