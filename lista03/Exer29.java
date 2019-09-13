/*
 * ENCONTRAR N�MEROS PRIMOS � UMA TAREFA DIF�CIL. FA�A UM PROGRAMA QUE
 * GERA UMA LISTA DOS N�MEROS PRIMOS EXISTENTES ENTRE 1 E UM N�MERO 
 * INTEIRO INFORMADO PELO USU�RIO.
 */
package lista03;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroInt, primo = 0;

		System.out.print("Informe o at� qual n�mero verificar: ");
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
				System.out.println(i + " � primo");
				System.out.println("------------------");
			} else {
				System.out.println(i + " n�o � primo");
				System.out.println("------------------");
			}
	
			primo = 0;
			
		}
		
		sc.close();
	}

}
