package RazgranataStruktura;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TernarnaStruktura {

	public static void main(String[] args) throws Exception {
		double x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		y = (x >= 0) ? x : -x;

		// ternarni operator ? - da
		// ternarni operator : - ne

		System.out.println("Za uneto x =" + x + " dobija se Y=" + y);

	}

}
