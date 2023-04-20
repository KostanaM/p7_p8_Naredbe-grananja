package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {
		double x, y, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x je: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("y je: ");
		y = Double.parseDouble(ulaz.readLine());

		if (x > y)
			f = Math.sqrt((x - 0.2) / (2 + y));
		else
			f = Math.sqrt((y - 0.2) / (2 + x));

		System.out.print("f je: " + df.format(f));

	}

}
