package RazgranataStruktura;

import java.util.Scanner;

public class Nula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost broja a:");
		int a = input.nextInt();

		System.out.println("Unesite vrednost broja b:");
		int b = input.nextInt();

		if (b != 0)
			System.out.println(a / b);

		else
			System.out.println("Deljenje nulom");

		input.close();

	}

}
