/**
 *
 */
package c07.h01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 */
public class Student implements Comparable<Student> {
    public String Name;
    public String Id;

    public Student() {
    }
    //public Student(String a,String b){

    public Student(String string1, String string2) {
        // TODO Auto-generated constructor stub
        this.Name = string2;
        this.Id = string1;
        Name = Id;

    }

    public String getId() {
        return this.Id;
    }

//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student){
//			Student s = (Student) obj;
//			if (s.Id.equals(this.Id)){
//				return true;
//			}else {
//				return false;
//			}
//		}else {
//			return false;
//		}
//	}

    @Override
    public int compareTo(Student o) {
        Long temp = Long.valueOf(this.Id) - Long.valueOf(o.Id);
        int temp1;
        temp1 = temp.intValue();
        return temp1;
    }

    public boolean equals(Student s) {

        if (s.Id.equals(this.Id)) {
            return true;
        } else {
            return false;
        }
    }

}



