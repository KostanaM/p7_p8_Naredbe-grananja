package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {
		double a, b, c;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a je: ");
		a = Double.parseDouble(ulaz.readLine());

		System.out.print("b je: ");
		b = Double.parseDouble(ulaz.readLine());

		System.out.print("c je: ");
		c = Double.parseDouble(ulaz.readLine());

		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));

			System.out.println("Površina trougla je: " + p);
		}
	}

}
