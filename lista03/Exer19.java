/*
 * FAÇA UM PROGRAMA QUE CALCULE E MOSTRE A MÉDIA ARITMÉTICA DE 'N' NOTAS.
 */
package lista03;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double nota, soma = 0;
		int media = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print((i + 1) + " nota: ");
			nota = sc.nextDouble();
			
			soma += nota;
			media += 1;
		}
		
		System.out.println("A soma das notas foi: " + soma);
		System.out.println("A média das notas foi: " + soma/media);
		sc.close();
	}

}
