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
public class Student extends Person{
    
    private int grade; //percentage
    private Address addr;

    public Student(String first, String last) {
        super(first, last);
    }

    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
