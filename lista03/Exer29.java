/*
 * ENCONTRAR NÚMEROS PRIMOS É UMA TAREFA DIFÍCIL. FAÇA UM PROGRAMA QUE
 * GERA UMA LISTA DOS NÚMEROS PRIMOS EXISTENTES ENTRE 1 E UM NÚMERO 
 * INTEIRO INFORMADO PELO USUÁRIO.
 */
package lista03;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroInt, primo = 0;

		System.out.print("Informe o até qual número verificar: ");
		numeroInt = sc.nextInt();
		System.out.println();

		for(int i = numeroInt; i > 0; i--) {
			
			for (int j = i; j > 0; j--) {
				// System.out.println(i + "/" + j);
				if (i % j == 0) {
					primo += 1;
				}

			}
			
			if (primo == 2) {
				System.out.println(i + " é primo");
				System.out.println("------------------");
			} else {
				System.out.println(i + " não é primo");
				System.out.println("------------------");
			}
	
			primo = 0;
			
		}
		
		sc.close();
	}

}
