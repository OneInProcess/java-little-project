/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c03.h03;

/**
 * @author zhao
 */
public class Dog {
    public String name, color;

    public Dog() {
        this.name = "none";
    }

    public String getName() {
        return this.name;
    }

    public Dog(String a) {
        this.name = a;
    }

    public Dog(String a, String b) {
        this.name = a;
        this.color = b;
    }

    public String getColor() {
        return this.color;
    }

}
