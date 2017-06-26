
package June26Lab;
//從-50到50隨機產生(不包含50)
public class TestNestesEx1 {
	public static void main(String[] args) {
		int value = (int) (Math.random()*(50-(-50)+1)+(-50) );
		if (value >= 0) {
			System.out.println(value + " is positive.");
			if (value % 2 == 0) {
				System.out.println(value + " is even!");
			} else {
				System.out.println(value + " is odd!");
			}
		} else {
			System.out.println(value + " is nagative.");
			if (value % 2 == 0) {
				System.out.println(value + " is even!");
			} else {
				System.out.println(value + " is odd!");
			}
		}
	}
}
