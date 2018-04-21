package c04.h02;

public class TypeValidator {

    public void validate(Object a) throws Exception {
        if (a instanceof String) {
            throw new Exception("String is not a valid type!");
        }
    }
}
