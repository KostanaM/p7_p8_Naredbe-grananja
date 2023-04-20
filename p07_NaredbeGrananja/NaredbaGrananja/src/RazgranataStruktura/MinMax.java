package RazgranataStruktura;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		double y, a, b;

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost broja a:");

		a = input.nextDouble();
		System.out.println("Unesite vrednost broja b:");

		b = input.nextDouble();

		if (a >= 0)
			y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
		else
			y = Math.min(a, b) / (Math.max(a * a, b * b) + 3);

		System.out.print("y je: " + y);

		input.close();

	}

}
