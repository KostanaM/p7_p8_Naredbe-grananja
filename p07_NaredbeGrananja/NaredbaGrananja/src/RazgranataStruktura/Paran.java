package RazgranataStruktura;

import java.util.Scanner;

public class Paran {

	public static void main(String[] args) {
		int a;
		double y;
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost broja a:");

		a = input.nextInt();
		if (a % 2 != 0)
			y = (double) 1 / a;
		else
			y = (a - 1) * (a - 1);

		System.out.print("y je: " + y);

		input.close();

	}

}
