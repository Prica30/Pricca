package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
				
		int f = sc.nextInt();
		int h = sc.nextInt();
		double v = sc.nextDouble();
		
		double s = ( h * v);
		
		System.out.println("NUMBER = " + f);
		System.out.printf("SALARY = U$ %.2f%n", s);
				
		sc.close();
	}

}
