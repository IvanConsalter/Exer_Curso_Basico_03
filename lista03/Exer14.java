/*
 * FA�A UM PROGRAMA QUE PE�A 10 N�MEROS INTEIROS, CALCULE E MOSTRE A
 * QUANTIDADE DE N�MEROS PARES E A QUANTIDADE DE N�MEROS �MPARES.
 */
package lista03;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, quantidadePar = 0, quantidadeImpar = 0;
		
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "� n�mero: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				quantidadePar += 1;
			}
			else {
				quantidadeImpar += 1;
			}
		}
		
		System.out.println(quantidadePar + " n�meros Pares");
		System.out.println(quantidadeImpar + " n�meros �mpares");
		
		
		
		sc.close();

	}

}
