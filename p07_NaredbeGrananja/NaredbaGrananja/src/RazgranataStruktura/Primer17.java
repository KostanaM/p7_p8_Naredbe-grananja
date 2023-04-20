package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer17 {

	public static void main(String[] args) throws Exception {
		double x, y, z;

		DecimalFormat df = new DecimalFormat("#.##");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x je: ");
		x = Double.parseDouble(ulaz.readLine());

		System.out.print("y je: ");
		y = Double.parseDouble(ulaz.readLine());

		System.out.print("z je: ");
		z = Double.parseDouble(ulaz.readLine());

		if (2 * x != y) {
			double f = (x + y) * (x + z) / (2 * x - y);

			System.out.println("Vrednost funkcije f je: " + df.format(f));
		} else
			// Štampanje poruke korisniku o pogrešnom unosu podataka
			System.out.println("Unos podataka nije ispravan (y se mora razlikovati od 2x)");

	}

}