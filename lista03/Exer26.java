/*
 * FA�A UM PROGRAMA QUE CALCULE O FATORIAL DE UM N�MERO INTEIRO
 * FORNECIDO PELO USU�RIO. EX: 5! = 5*4*3*2*1 = 120.
 * A SA�DA DEVE SER CONFORME O EXEMPLO ABAIXO:
 * 
 * FATORIAL DE: 5
 * 5! = 5 . 4 . 3 . 2 . 1 = 120
 */
package lista03;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int resposta, numero;

		System.out.print("Deseja o Fatorial de qual n�mero: ");
		numero = sc.nextInt();

		resposta = numero;
		
		System.out.println("FATORIAL DE: " + numero);
		System.out.print(numero + "! = ");

		for (int i = numero; i > 1; i--) {
			resposta *= (i - 1);
			if (i == 1) {
				break;
			}
			System.out.print(i + " * ");
		}

		
		System.out.print("1 = " + resposta);

		sc.close();

	}

}
