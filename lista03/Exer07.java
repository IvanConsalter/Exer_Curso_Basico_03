/*
 * FA�A UM PROGRAMA QUE LEIA 5 N�MEROS E INFORME O MAIOR.
 */
package lista03;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int maior;
		int posicao = 1;
		
		System.out.print("1� n�mero: ");
		maior = sc.nextInt();
		
		for(int i = 2; i <= 5; i++) {
			System.out.print(i + "� n�mero: ");
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
				posicao = i;
			}
		}
		
		System.out.println("O maior n�mero foi: " + maior + " na posi��o " + posicao);
		sc.close();
	}

}
