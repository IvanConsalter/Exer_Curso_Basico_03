/*
 * FAÇA UM PROGRAMA QUE IMPRIMA NA TELA OS NÚMEROS DE 1 A 20, 
 * UM ABAIXO DO OUTRO. DEPOIS MODIFIQUE O PROGRAMA PARA QUE ELE
 * MOSTRE OS NÚMEROS UM AO LADO DO OUTRO.
 */
package lista03;

public class Exer06 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++ ) {
			System.out.println(i);
		}
		
		for(int i = 1; i <= 20; i++ ) {
			System.out.print(i + " ");
		}

	}

}
