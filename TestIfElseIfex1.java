package June26Lab;

public class TestIfElseIfex1 {

	public static void main(String[] args) {
		int Mon = (int)(Math.random()*12)+1;
		int Year =(int)(Math.random()*100)+1990;
		System.out.println("The year is "+Year);
		if (Mon == 1 || Mon == 3 || Mon == 5 || Mon == 7 || Mon == 8 || Mon == 10 || Mon == 12) {
			System.out.println(Mon + " has 31 days!");
		} else if (Mon == 4 || Mon == 6 || Mon == 9 || Mon == 11) {
			System.out.println(Mon + " has 30 days!");
		} else if (Mon == 2) {
			if (Year % 4 == 0 || Year % 400 == 0 && Year % 100 != 0) {
				System.out.println(Mon + " has 29 days!");
			} else {
				System.out.println(Mon + " has 28 days!");
			}
		}
		if (Mon > 12) {
			System.out.println("error");
		}
		System.out.println("finish!");
	}

}
