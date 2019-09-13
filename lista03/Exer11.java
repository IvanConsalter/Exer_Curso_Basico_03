/*
 * ALTERE O PROGRAMA ANTERIOR PARA MOSTRAR NO FINAL A SOMA DOS NÚMEROS.
 */
package lista03;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma = 0;

		System.out.print("Número a iniciar: ");
		int primeiroNumero = sc.nextInt();
		System.out.print("Número a terminar: ");
		int ultimoNumero = sc.nextInt();

		for (int i = (primeiroNumero + 1); i < ultimoNumero; i++) {
			System.out.println(i);
			soma += i;
			
		}
		
		System.out.println("A soma é: " + soma);
		
		
		sc.close();

	}

}
