package June26Lab;

public class TestIfEx1 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * (40 - 20 + 1)) + 20;
		if (a >= 30) {
			System.out.println("It's hot");
		} else {
			System.out.println("so so");
		}
		System.out.println("Go on");
	}

}
