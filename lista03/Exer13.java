/*
 * FA�A UM PROGRAMA QUE PE�A DOIS N�MEROS, BASE E EXPONTE, CALCULE E 
 * MOSTRE O PRIMEIRO N�MERO ELEVADO AO SEGUNDO N�MERO. N�O UTILIZE A 
 * FUN��O DE POT�NCIA DA LINGUAGEM.
 */
package lista03;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base, expoente, resultado = 1;
		
		
		System.out.print("Entre com a Base: ");
		base = sc.nextInt();
		System.out.print("Entre com o expoente: ");
		expoente = sc.nextInt();
		
		
		for(int i = 0; i < expoente; i++) {
			resultado *= base ;
		}
		
		System.out.println(resultado);
		sc.close();

	}

}
