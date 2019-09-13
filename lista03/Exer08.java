/*
 * FAÇA UM PROGRAMA QUE LEIA 5 NÚMEROS E INFORME A SOMA E
 * A MÉDIA DOS NÚMEROS.
 */
package lista03;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero;
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "° número:");
			numero = sc.nextDouble();
			soma += numero;
			media = soma/(i+1);
		}
		
		
		
		System.out.println("A soma = " + soma);
		System.out.println("A média = " + media);
		
		
		
		sc.close();

	}

}
