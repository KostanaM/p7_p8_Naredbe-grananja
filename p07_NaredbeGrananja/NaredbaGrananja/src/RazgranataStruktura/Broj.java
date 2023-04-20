package RazgranataStruktura;

import java.util.Scanner;

public class Broj {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int broj, s, d, j, rezultat;

		System.out.println("Unesite vrednost trocifreni broj:");
		broj = input.nextInt();

		s = broj / 100;
		d = (broj % 100) / 10;
		j = broj % 10;

		if (j > d) {
			int t = j;
			j = d;
			d = t;
		}
		if (j > s) {
			int t = j;
			j = s;
			s = t;
		}
		if (d > s) {
			int t = d;
			d = s;
			s = t;
		}
		rezultat = s * 100 + d * 10 + j;
		System.out.print("Rezutat " + rezultat);

		input.close();
	}

}
