package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfElseStruktura {

	public static void main(String[] args) throws Exception {
		// Deklarisanje podataka
		double x, y;

		// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x je: ");
		x = Double.parseDouble(ulaz.readLine());

		// Primena uslovnog operatora
		if (x >= 0)
			y = x;

		else
			y = -x;

		// y = (x >= 0) ? x : -x;

		// Štampanje rezultata
		System.out.println("Za uneto X=" + x + "\tdobije se Y=" + y);

	}

}
