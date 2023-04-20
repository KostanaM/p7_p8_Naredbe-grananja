package RazgranataStruktura;

import java.util.Scanner;

public class Oblast {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite kordinatu tacke x: ");
		double x = input.nextDouble();
		System.out.println("Unesite kordinatu tacke y: ");
		double y = input.nextDouble();

		System.out.println("Unesite kordinatu tacke x1: ");
		double x1 = input.nextDouble();
		System.out.println("Unesite kordinatu tacke x2: ");
		double x2 = input.nextDouble();
		System.out.println("Unesite kordinatu tacke y1: ");
		double y1 = input.nextDouble();
		System.out.println("Unesite kordinatu tacke y2: ");
		double y2 = input.nextDouble();

		if ((x > x1) && (x < x2) && (y > y1) && (y < y2))
			System.out.println("Tačka je unutar pravougaonika");
		else
			System.out.println("Tačka nije unutar pravougaonika");

		input.close();

	}

}
