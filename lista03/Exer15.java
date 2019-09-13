/*
 * A S�RIE DE FIBONACCI � FORMADA PELA SEQU�NCIA 
 * 0,1,1,2,3,5,8,13,21,34,55...FA�A UM PROGRAMA
 * CAPAZ DE GERAR A S�RIE AT� O N-�SIMO TERMO.
 */
package lista03;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha o n-�simo termo da sequ�cia de Fibonacci: ");
		int termoAescolher = sc.nextInt();
		
		int primeiroNumero = 0;
		int segundoNumero = 1;
		int terceiroNumero = primeiroNumero + segundoNumero;
		
		System.out.print(primeiroNumero + " ");
		System.out.print(segundoNumero + " ");
		System.out.print(terceiroNumero + " ");
		
		for(int i = 0; i <= (termoAescolher - 4); i++) {
			
			primeiroNumero = segundoNumero;
			segundoNumero = terceiroNumero;
			terceiroNumero = primeiroNumero + segundoNumero;
			
			System.out.print(terceiroNumero + " ");
			
		}
		
		
		sc.close();
	}

}
