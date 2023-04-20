package RazgranataStruktura;

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost broja a:");
		int a = input.nextInt();

		System.out.println("Unesite vrednost broja b:");
		int b = input.nextInt();

		System.out.println("Unesite vrednost broja c:");
		int c = input.nextInt();

		/*
		 * int max = a; if (b > max) max = b; if (c > max) max = c;
		 */

		int max;

		if (b > a)
			max = b;
		else
			max = a;

		if (c > a)
			max = c;
		else
			max = a;

		if (c > b)
			max = c;
		else
			max = b;

		System.out.println("Najveci broj je: " + max);

		input.close();

	}

}
