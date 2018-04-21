package c04.h01;

public class Dog {

    int count = 0;

    public void feed() throws Exception {
        count++;
        if (count == 4) {
            throw new Exception("I can not eat more!");
        }
    }
}
