package RazgranataStruktura;

import java.util.Scanner;

public class NajmanjiBroj {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost broja a:");
		int a = input.nextInt();

		System.out.println("Unesite vrednost broja b:");
		int b = input.nextInt();

		System.out.println("Unesite vrednost broja c:");
		int c = input.nextInt();

		int min = a;

		if (b < min)
			min = b;

		if (c < min)
			min = c;

		System.out.println("Namanji broj je: " + min);

		input.close();

	}

}
