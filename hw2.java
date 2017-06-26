package June26Lab;

import java.text.DecimalFormat;

public class hw2 {

	public static void main(String[] args) {
		double tem =  (Math.random() * (50 - (-50) + 1) + (-50));
		DecimalFormat df=new DecimalFormat("#.##");
		double a=0;
		
		int index = 1;
		if (index == 1) {
			
			a=(tem * 9 / 5 + 32);
			String s=df.format(a);
			System.out.println((tem%.2f )+ "C=  " + s+ "F");
			
		} else if (index == 2) {
			System.out.println((tem - 32) * 5 / 9 + "C");
		} else {
			System.out.println("error");
		}

	}

}