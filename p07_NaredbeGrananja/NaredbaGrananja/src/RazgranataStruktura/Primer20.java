package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer20 {

	public static void main(String[] args) throws Exception {
		double x, y, p, q, f;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x je: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("y je: ");
		y = Double.parseDouble(ulaz.readLine());
		System.out.print("p je: ");
		p = Double.parseDouble(ulaz.readLine());
		System.out.print("q je: ");
		q = Double.parseDouble(ulaz.readLine());

		f = (p < q) ? p : q;
		if (y > f)
			f = y;
		if (x < f)
			f = x;

		System.out.println("Vrednost funkcije y je: " + f);

	}

}