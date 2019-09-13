/*
 * SUPONDO QUE A POPULA��O DE UM PA�S 'A' SEJA DA ORDEM DE 80.000 HABITANTES,
 * COM UMA TAXA ANUAL DE CRESCIMENTO DE 3% E QUE A POPULA��O DE 'B' SEJA 200.000
 * HABITANTES COM UMA TAXA DE CRESCIMENTO DE 1.5%.
 * FA�A UM PROGRAMA QUE CALCULE E ESCREVA O N�MERO DE ANOS NECESS�RIOS PARA QUE 
 * A POPULA��O DO PA�S 'A' ULTRAPASSE OU IGUALE A POPULA��O DO PA�S 'B',
 * MANTIDAS AS TAXAS DE CRESCIMENTO.
 */
package lista03;

public class Exer04 {

	public static void main(String[] args) {
		
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		while(paisA <= paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos += 1;
		}
		
		System.out.println("Popula��o do Pa�s A: " + paisA);
		System.out.println("Popula��o do Pa�s B: " + paisB);
		System.out.println("Quantidade de Anos:" + anos + " anos");
	}

}
