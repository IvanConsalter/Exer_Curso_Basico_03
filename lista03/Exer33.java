/*
 * FAÇA UM PROGRAMA QUE MOSTRE OS N TERMOS DA SÉRIE A SEGUIR:
 * 
 * S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + .... + N/M
 * 
 * IMPRIMA O FINAL DA SOMA SÉRIE.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		int numero;
		double soma = 0;
		
		System.out.print("Digite um valor para N: ");
		numero = sc.nextInt();
		System.out.println();
		
		for (double n = 1, m = 1; n <= numero; n++, m += 2) {
			System.out.print(n + "/" + m + " + ");
			soma += n / m;
			
		}
		System.out.println();
		System.out.println("Soma = " + df.format(soma));
	
		sc.close();
	}

}
