package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa02 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x, a, c;
		
		x = sc.nextDouble();
		a = 3.14159;
		
		c = a * x * x;
		
		System.out.printf("%.4f%n", c);
		
		sc.close();			
		
	}
}