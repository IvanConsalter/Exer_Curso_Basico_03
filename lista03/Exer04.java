/*
 * SUPONDO QUE A POPULAÇÃO DE UM PAÍS 'A' SEJA DA ORDEM DE 80.000 HABITANTES,
 * COM UMA TAXA ANUAL DE CRESCIMENTO DE 3% E QUE A POPULAÇÃO DE 'B' SEJA 200.000
 * HABITANTES COM UMA TAXA DE CRESCIMENTO DE 1.5%.
 * FAÇA UM PROGRAMA QUE CALCULE E ESCREVA O NÚMERO DE ANOS NECESSÁRIOS PARA QUE 
 * A POPULAÇÃO DO PAÍS 'A' ULTRAPASSE OU IGUALE A POPULAÇÃO DO PAÍS 'B',
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
		
		System.out.println("População do País A: " + paisA);
		System.out.println("População do País B: " + paisB);
		System.out.println("Quantidade de Anos:" + anos + " anos");
	}

}
