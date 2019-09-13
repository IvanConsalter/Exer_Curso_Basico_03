/*
 * FAÇA UM PROGRAMA QUE RECEBA DOIS NÚMEROS INTEIROS E GERE OS NÚMEROS INTEIROS
 * QUE ESTÃO NO INTERVALO COMPREENDIDO POR ELES.
 */
package lista03;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número a iniciar: ");
		int primeiroNumero = sc.nextInt();
		System.out.print("Número a terminar: ");
		int ultimoNumero = sc.nextInt();
		
		for(int i = (primeiroNumero + 1); i < ultimoNumero; i++) {
			System.out.println(i);
		}
			
		
		sc.close();

	}

}
