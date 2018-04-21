/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c03.h01;

/**
 * @author zhao
 */
public class Student {
    public String name;
    public String pid;

    public Student(String x) {
        this.name = x;
    }

    public String getName() {
        return this.name;
    }

    public void setPid(String b) {
        this.pid = b;
    }

    public String getPid() {
        return this.pid;
    }
    //public String valueOf(Student a){
    //return "name="+a.getName()+" pid="+a.getPid();

    //}
    public boolean equals(Student s) {
        if (s.getPid() == (this.getPid())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "name=" + this.getName() + " pid=" + this.getPid();
    }


}

