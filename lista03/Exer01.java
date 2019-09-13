/**
 * FA�A UM PROGRAMA QUE PE�A UMA NOTA, ENTRE 0 E 10.
 * MOSTRE UMA MENSAGEM CASO O VALOR SEJA INV�LIDO E CONTINUE PEDINDO
 * AT� QUE O USU�RIO INFORME UM VALOR V�LIDO.
 */

package lista03;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean notaValida = false;
		
		do {
			System.out.print("Digite uma nota: ");
			double nota = sc.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				System.out.println("A nota digitada foi " + nota);
				notaValida = true;
			}
			else {
				System.out.println("Nota incorreta, digite entre 0 e 10.");
			}
			
		}while(notaValida == false);
		
		
		
		sc.close();
	}

}
