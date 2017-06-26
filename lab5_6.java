package June26Lab;

import java.util.Scanner;

public class lab5_6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n,i=1,sum=0;
		do {
			System.out.println("輸入最大值：");
			n=scn.nextInt();
		}while(n!=1);
		do
			sum+=i++;
		while(i<=n);
		System.out.println("1+2+3+...+n="+sum);
	}

}
