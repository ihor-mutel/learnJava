/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
        Person ben = new Person("Ben", "Evans");
        ben.setAge(38);

        Person mum = new Person("Sue", "Evans");
        mum.setAge(67);
        
        ben.setMother(mum);
                
        Person dad = new Person("Martian", "Evans");
        dad.setAge(68);
        
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(ben);
        myFamily.add(mum); //, mum.getFirstName());
        myFamily.add(dad); //, dad.getFirstName());
        
        double ave = 0.0;
        
        for (Iterator<Person> it = myFamily.iterator(); it.hasNext();) {
            Person p = it.next();
            ave += p.getAge();
        }
        ave = ave / myFamily.size();

        
        System.out.println(ave);
                
        Object o = new Student("Billy", "Bunter");
        System.out.println(o.getClass());
        
//        o = "Otter";
//        System.out.println(o.getClass());
        
        
        if (o instanceof Person) {
            System.out.println("o is a person");       
        }
    }

    
}
