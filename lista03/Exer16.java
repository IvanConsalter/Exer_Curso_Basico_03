/*
 * A S�RIE DE FIBONACCI � FORMADA PELA SEQU�NCIA 
 * 0,1,1,2,3,5,8,13,21,34,55...FA�A UM PROGRAMA
 * QUE GERE A S�RIE AT� QUE O VALOR SEJA MAIOR QUE 500.
 */
package lista03;


public class Exer16 {

	public static void main(String[] args) {
		

		int primeiroNumero = 0;
		int segundoNumero = 1;
		int terceiroNumero = primeiroNumero + segundoNumero;

		System.out.print(primeiroNumero + " ");
		System.out.print(segundoNumero + " ");
		System.out.print(terceiroNumero + " ");

		
		for (int i = 0; i < 20; i++) {
			
			if(terceiroNumero > 500) {
				break;
			}

			primeiroNumero = segundoNumero;
			segundoNumero = terceiroNumero;
			terceiroNumero = primeiroNumero + segundoNumero;

			System.out.print(terceiroNumero + " ");
			
			

		}

		
	}

}
