/*
 * SENDO H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, FAÇA UM PROGRAMA QUE
 * CALCULE O VALOR DE H COM N TERMOS.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");

		int numeroN;
		double soma = 0;
		
		System.out.print("Entre com valor pra N: ");
		numeroN = sc.nextInt();
		
		for(double i = 1; i <= numeroN; i++) {
			System.out.print("1/" + i + " + ");
			soma += 1/i;
		}
		System.out.println();
		System.out.println("Soma = " + df.format(soma));
		sc.close();
	}

}
