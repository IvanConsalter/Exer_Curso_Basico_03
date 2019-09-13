/*
 * DESENVOLVA UM PROGRAMA QUE FAÇA A TABUADA DE UM NÚMERO QUALQUER
 * INTEIRO QUE SERÁ DIGITADO PELO USUÁRIO, MAS A TABUADA NÃO DEVE
 * NECESSARIAMENTE INICIAR EM 1 E TERMINAR EM 10, O VALOR INICIAL
 * E FINAL DEVEM SER INFORMADOS TAMBÉM PELO USUÁRIO, CONFORME 
 * EXEMPLO ABAIXO:
 * 
 * MONTAR A TABUADA DE: 5
 * COMEÇAR POR: 4
 * TERMINAR EM: 7
 * 
 * VOU MONTAR A TABUADA DE 5 COMEÇANDO EM 4 E TERMINANDO EM 7:
 * 
 * 5 X 4 = 20
 * 5 X 5 = 25
 * 5 X 6 = 30
 * 5 X 7 = 35
 * 
 * OBS: VOCÊ DEVE VERIFICAR SE O USUÁRIO NÃO DIGITOU O FINAL MENOR 
 * QUE O INICIAL.
 */
package lista03;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabuada, inicio, fim;
		boolean validar = false;
		
		System.out.print("MONTAR A TABUADA DO: ");
		tabuada = sc.nextInt();
		System.out.print("COMEÇAR POR: ");
		inicio = sc.nextInt();
		do {
			System.out.print("TERMINAR EM: ");
			fim = sc.nextInt();
			
			if(fim < inicio) {
				System.out.println("DEVE SER MAIOR QUE INICIO.");
			}
			else {
				validar = true;
			}
		}while(validar == false);
		
		for(int i = inicio; i <= fim; i++) {
			System.out.println(tabuada + " X " + i + " = " + tabuada*i);
		}
		
		
		sc.close();
	}

}
