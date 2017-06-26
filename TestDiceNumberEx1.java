package June26Lab;

public class TestDiceNumberEx1 {

	public static void main(String[] args) {
		int Dicenum = (int) (Math.random() * 6) + 1;
		System.out.println("Dicenum=" + Dicenum);
		int LuckyNum = 4;
		if (Dicenum == LuckyNum) {
			System.out.println("You win!");
		} else {
			System.out.println("Try again!");
		}
		System.out.println("Finish!");
	}

}
