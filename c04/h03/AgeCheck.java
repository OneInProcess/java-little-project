package c04.h03;

public class AgeCheck implements AgeCheckInterface {

	public void checkAge(int age) throws RuntimeException {
		if (age < 0 || age > 200) {
			throw new RuntimeException();
		}
	}
}
