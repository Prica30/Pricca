package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double vUnit1, vUnit2, valor;
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		vUnit1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		vUnit2 = sc.nextDouble();
		
		valor = ((numPeca1 * vUnit1) + (numPeca2 * vUnit2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();
		
	}

}
