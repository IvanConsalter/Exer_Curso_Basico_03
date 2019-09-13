/*
 *O DEPARTAMENTO ESTADUAL DE METEOROLOGIA LHE CONTRATOU PARA
 *DESENVOLVER UM PROGRAMA QUE LEIA UM CONJUNTO INDETERMINADO
 *DE TEMPERATURAS, E INFORME AO FINAL A MENOR E A MAIOR DAS 
 *TEMPERATURAS INFORMADAS, BEM COMO A MÉDIA DAS TEMPERATURAS. 
 */
package lista03;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double resposta, menorTemperatura, maiorTemperatura, soma = 0, media = 0;
		int i = 0;
		boolean sair = false;

		System.out.println("PARA SAIR DIGITE: 0");
		System.out.print("DIA 1: ");
		resposta = sc.nextDouble();
		menorTemperatura = resposta;
		maiorTemperatura = resposta;

		do {

			i += 1;
			soma += resposta;
			System.out.print("DIA " + (i + 1) + ": ");
			resposta = sc.nextDouble();

			if (resposta == 0) {
				sair = true;
				break;
			} else if (resposta < menorTemperatura) {
				menorTemperatura = resposta;
			}

			if (resposta > maiorTemperatura) {
				maiorTemperatura = resposta;
			}

		} while (sair == false);

		media = soma / i;

		System.out.println("A menor Temperatura foi: " + menorTemperatura);
		System.out.println("A Maior Temperatura foi: " + maiorTemperatura);
		System.out.println("A média foi: " + media);

		sc.close();
	}

}
