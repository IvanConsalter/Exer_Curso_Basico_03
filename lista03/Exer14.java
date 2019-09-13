/*
 * FAÇA UM PROGRAMA QUE PEÇA 10 NÚMEROS INTEIROS, CALCULE E MOSTRE A
 * QUANTIDADE DE NÚMEROS PARES E A QUANTIDADE DE NÚMEROS ÍMPARES.
 */
package lista03;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, quantidadePar = 0, quantidadeImpar = 0;
		
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "° número: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				quantidadePar += 1;
			}
			else {
				quantidadeImpar += 1;
			}
		}
		
		System.out.println(quantidadePar + " números Pares");
		System.out.println(quantidadeImpar + " números Ìmpares");
		
		
		
		sc.close();

	}

}
