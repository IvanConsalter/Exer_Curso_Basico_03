/*
 * DESENVOLVA UM GERADOR DE TABUADAS, CAPAZ DE GERAR A TABUADA DE
 * QUALQUER NÚMERO INTEIRO DE 1 A 10. O USUÁRIO DEVE INFORMAR DE QUAL
 * NÚMERO ELE DESEJA VER A TABUADA. A SAÍDA DEVE SER CONFORME O EXEMPLO
 * ABAIXO:
 * 
 * TABUADA DO 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */
package lista03;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		boolean verificadorNumero = false;
		
		do {
			System.out.print("Entre com o número da tabuada que deseja: ");
			numero = sc.nextInt();
			if(numero <= 0 || numero > 10 ) {
				System.out.println("Somente números de 1 a 10.");
			}
			else {
				verificadorNumero = true;
			}
		}while(verificadorNumero == false);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numero + " X " + (i + 1) + " = " + numero * (i + 1));
		}
		
		sc.close();

	}

}
