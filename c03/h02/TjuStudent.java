/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c03.h02;

/**
 * @author zhao
 */
public class TjuStudent extends Human implements Student, Youth {
    public String name;
    public int age;

    public TjuStudent(String s) {
        this.name = s;
    }

    public String study() {
        return "I study";
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public int getAge() {
        return this.age;

    }
    
    

    
    
}
