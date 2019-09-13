/*
 * FAÇA UM PROGRAMA QUE PEÇA DOIS NÚMEROS, BASE E EXPONTE, CALCULE E 
 * MOSTRE O PRIMEIRO NÚMERO ELEVADO AO SEGUNDO NÚMERO. NÃO UTILIZE A 
 * FUNÇÃO DE POTÊNCIA DA LINGUAGEM.
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
