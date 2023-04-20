package RazgranataStruktura;

import java.util.Scanner;

public class Paran1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za a:");

		double a = input.nextDouble();
		double y;

		if (a > 0)
			y = Math.sqrt(a);
		else
			y = a * a;

		System.out.print("y je: " + y);

		input.close();

	}

}
