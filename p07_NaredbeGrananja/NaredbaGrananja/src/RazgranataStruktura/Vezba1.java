package RazgranataStruktura;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		int a, b, c;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost a");
		a = ulaz.nextInt();

		System.out.println("Unesite vrednost b");
		b = ulaz.nextInt();

		System.out.println("Unesite vrednost b");
		c = ulaz.nextInt();

		/*
		 * if (a > b && a > c)
		 * 
		 * z = a;
		 * 
		 * if (b > a && b > c) z = b;
		 * 
		 * if (c > a && c > b) z = c;
		 */
		double min = a;
		double r = 0;

		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println("Min: " + min);
		if (min == 0)
			r = 3;
		else
			r = 1 / min;

		System.out.println("rec " + r);
		ulaz.close();
	}

}
