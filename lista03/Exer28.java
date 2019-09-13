/*
 * OS NÚMEROS PRIMOS POSSUEM VÁRIAS APLICAÇÕES DENTRO DA 
 * COMPUTAÇÃO, POR EXEMPLO NA CRIPTOGRAFIA. UM NÚMERO PRIMO
 * É AQUELE QUE É DIVISÍVEL APENAS POR UM E POR ELE MESMO.
 * FAÇA UM PROGRAMA QUE PEÇA UM NÚMERO INTEIRO E DETERMINE 
 * SE ELE É OU NÃO UM NÚMERO PRIMO.
 */
package lista03;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroInt, primo = 0;

		System.out.println("Entre com um número inteiro: ");
		numeroInt = sc.nextInt();

		for (int i = 1; i <= numeroInt; i++) {
			if (numeroInt % i == 0) {
				primo += 1;
			}
		}

		if (primo == 2) {
			System.out.println(numeroInt + " é primo");
		} else {
			System.out.println(numeroInt + " não é primo");
		}

		sc.close();

	}

}
