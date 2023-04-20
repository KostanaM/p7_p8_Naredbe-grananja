package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer19 {

	public static void main(String[] args) throws Exception {
		double q, r, s, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("q je: ");
		q = Double.parseDouble(ulaz.readLine());
		System.out.print("r je: ");
		r = Double.parseDouble(ulaz.readLine());
		System.out.print("s je: ");
		s = Double.parseDouble(ulaz.readLine());

		y = (r > s) ? r : s;
		if (q < y)
			y = q;

		System.out.println("Vrednost funkcije y je: " + y);

	}

}