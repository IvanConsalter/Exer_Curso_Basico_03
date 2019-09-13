/*
 * ALTERE O PROGRAMA ANTERIOR PERMITINDO AO USUÁRIO INFORMAR AS 
 * POPULAÇÕES E AS TAXAS DE CRESCIMENTO INICIAIS. VALIDE A ENTRADA
 * E PERMITA REPETIR A OPERAÇÃO.
 */
package lista03;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean verificadorPais = false;
		int pais1, pais2, anos = 0;
		double taxaPais1, taxaPais2;
		
		do {
			System.out.print("Entre com a quantidade de habitantes do 1° País: ");
			pais1 = sc.nextInt();
			System.out.print("Entre com a taxa anual de crescimento: ");
			taxaPais1 = sc.nextDouble();
			System.out.print("Entre com a quantidade de habitantes do 2° País: ");
			pais2 = sc.nextInt();
			System.out.print("Entre com a taxa anual de crescimento: ");
			taxaPais2 = sc.nextDouble();
			
			if(pais1 > pais2) {
				System.out.println("Habitantes do 2° País tem que ser maior que o 1° País.");
				System.out.println("Digite novamente.");
			}
				else if(taxaPais1 < taxaPais2) {
					System.out.println("Taxa 2° País tem quer ser menor que a Taxa do 1° País");
					System.out.println("Digite novamente.");
				}
					else {
						verificadorPais = true;
					}
		}while(verificadorPais == false);
		
		
		while(pais1 <= pais2) {
			pais1 += (pais1 / 100) * taxaPais1;
			pais2 += (pais2 / 100) * taxaPais2;
			anos += 1;
		}
		
		System.out.println("População do País A: " + pais1);
		System.out.println("População do País B: " + pais2);
		System.out.println("Quantidade de Anos:" + anos + " anos");

		
		sc.close();
	}

}
