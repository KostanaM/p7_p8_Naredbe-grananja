package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer18 {

	public static void main(String[] args) throws Exception {
		double x;
		boolean y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x je: ");
		x = Double.parseDouble(ulaz.readLine());

		if (x >= 1) {
			y = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;

			System.out.println("Vrednost funkcije y je: " + y);
		} else
			// Štampanje poruke korisniku o pogrešnom unosu podataka
			System.out.println("Unos vrednosti za podatak x nije isparavan (x mora biti veće ili jednako 1 ");

	}

}