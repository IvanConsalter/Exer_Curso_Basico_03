/*
 * FAÇA UM PROGRAMA QUE PEÇA UM NÚMERO INTEIRO E DETERMINE SE ELE É
 * OU NÃO UM NÚMERO PRIMO. UM NÚMERO PRIMO É AQUELE QUE É DIVISÍVEL
 * SOMENTE POR ELE MESMO E POR 1.
 */
package lista03;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroInt, primo = 0;
		
		System.out.println("Entre com um número inteiro: ");
		numeroInt = sc.nextInt();
		
		for(int i = 1; i <= numeroInt; i++) {
			if(numeroInt % i == 0) {
				primo += 1;
			}
		}
		
		if(primo == 2) {
			System.out.println(numeroInt + " é primo");
		}else {
			System.out.println(numeroInt + " não é primo");
		}
		
		sc.close();

	}

}
