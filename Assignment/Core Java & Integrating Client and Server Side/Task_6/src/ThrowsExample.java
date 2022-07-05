
public class ThrowsExample {

	public int division(int a, int b) throws ArithmeticException {
		int t = a / b;
		return t;
	}

	public static void main(String args[]) {
		ThrowsExample obj = new ThrowsExample();
		try {
			System.out.println(obj.division(15, 0));
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divided by zero");
		}
	}

}