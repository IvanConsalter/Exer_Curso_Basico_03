/*
 * OS N�MEROS PRIMOS POSSUEM V�RIAS APLICA��ES DENTRO DA 
 * COMPUTA��O, POR EXEMPLO NA CRIPTOGRAFIA. UM N�MERO PRIMO
 * � AQUELE QUE � DIVIS�VEL APENAS POR UM E POR ELE MESMO.
 * FA�A UM PROGRAMA QUE PE�A UM N�MERO INTEIRO E DETERMINE 
 * SE ELE � OU N�O UM N�MERO PRIMO.
 */
package lista03;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroInt, primo = 0;

		System.out.println("Entre com um n�mero inteiro: ");
		numeroInt = sc.nextInt();

		for (int i = 1; i <= numeroInt; i++) {
			if (numeroInt % i == 0) {
				primo += 1;
			}
		}

		if (primo == 2) {
			System.out.println(numeroInt + " � primo");
		} else {
			System.out.println(numeroInt + " n�o � primo");
		}

		sc.close();

	}

}
