package RazgranataStruktura;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost broja a:");
		int a = input.nextInt();

		System.out.println("Unesite vrednost broja b:");
		int b = input.nextInt();

		int z;

		if ((a % 2 != 0) && (b % 2 == 0))
			z = a + b;
		else
			z = a * b;

		System.out.print("z je: " + z);

		input.close();

	}

}
