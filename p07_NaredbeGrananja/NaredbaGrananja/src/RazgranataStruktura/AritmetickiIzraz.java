package RazgranataStruktura;

import java.util.Scanner;

public class AritmetickiIzraz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za a:");
		double a = input.nextDouble();

		System.out.println("Unesite vrednost za b:");
		double b = input.nextDouble();

		double z;

		if (a > b)
			z = 2 * a + b;
		else
			z = a - 2 * b;

		System.out.print("z je: " + z);

		input.close();

	}

}
