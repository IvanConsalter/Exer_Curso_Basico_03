/*
 * FAÇA UM PROGRAMA QUE CALCULE O VALOR TOTAL INVESTIDO POR UM 
 * COLECIONADOR EM SUA COLEÇÃO DE CDS E O VALOR MÉDIO GASTO EM
 * CADA UM DELES. O USUÁRIO DEVERÁ INFORMAR A QUANTIDADE DE CDS
 * E O VALOR PARA EM CADA UM.
 */
package lista03;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cds;
		double preco, total = 0, valorMedio;
		System.out.print("Quantidade de Cds: ");
		cds = sc.nextInt();
		
		
		for(int i = 0; i < cds; i++) {
			
			System.out.print("Preço CD " + (i + 1) + ": ");
			preco = sc.nextDouble();
			
			total += preco;
			
		}
		
		valorMedio = total / cds;
		
		System.out.println("Total investido: " + total);
		System.out.println("Valor médio gasto: " + valorMedio + " por CD");
		
		sc.close();

	}

}
