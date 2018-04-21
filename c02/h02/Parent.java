package c02.h02;

public class Parent {
    public String name;

    public Parent() {

    }

    public Parent(String a) {
        name = a;
    }

    public static String speak() {
        return "parent";
    }

    public String getName() {
        return name;
    }
}
