package c02.h02;

public class Child extends Parent {
    public String name;

    public Child() {

    }

    public Child(String b) {
        this.name = b;
    }

    public static String speak() {
        return "child";
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return name + "'s father";
    }
}
