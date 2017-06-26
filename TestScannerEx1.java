package June26Lab;

import java.util.Scanner;

public class TestScannerEx1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a;
		System.out.println("input a:");
		a = scn.nextInt();
		if (a >= 0) {
			System.out.println(a + " is positive.");
			if (a % 2 == 0) {
				System.out.println(a + " is even");
			} else {
				System.out.println(a + " is odd");
			}
		} else {
			System.out.println(a + " is negative.");
			if (a % 2 == 0) {
				System.out.println(a + " is even");
			} else {
				System.out.println(a + " is odd");
			}
		}
	}

}
