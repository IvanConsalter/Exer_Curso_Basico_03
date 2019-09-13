/*
 * FAÇA UM PROGRAMA QUE LEIA 5 NÚMEROS E INFORME O MAIOR.
 */
package lista03;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int maior;
		int posicao = 1;
		
		System.out.print("1° número: ");
		maior = sc.nextInt();
		
		for(int i = 2; i <= 5; i++) {
			System.out.print(i + "° número: ");
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
				posicao = i;
			}
		}
		
		System.out.println("O maior número foi: " + maior + " na posição " + posicao);
		sc.close();
	}

}
