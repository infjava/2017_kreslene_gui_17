/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoznamstudentov;

/**
 *
 * @author janik
 */
class Student {
    private String meno;

    public Student(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return this.meno;
    }

    @Override
    public String toString() {
        return "Student{" + "meno=" + this.meno + '}';
    }
    
    
}
