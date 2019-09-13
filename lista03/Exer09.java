/*
 * FAÇA UM PROGRAMA QUE IMPRIMA NA TELA APENAS OS NÚMEROS ÍMPARES
 * ENTRE 1 E 50.
 */
package lista03;

public class Exer09 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 50; i++) {
			if(i % 2 == 1) {
				System.out.println("Números ímpares: " + i);
			}
		}

	}

}
