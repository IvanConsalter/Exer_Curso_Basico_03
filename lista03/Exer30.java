/*
 * DESENVOLVA UM PROGRAMA QUE FA�A A TABUADA DE UM N�MERO QUALQUER
 * INTEIRO QUE SER� DIGITADO PELO USU�RIO, MAS A TABUADA N�O DEVE
 * NECESSARIAMENTE INICIAR EM 1 E TERMINAR EM 10, O VALOR INICIAL
 * E FINAL DEVEM SER INFORMADOS TAMB�M PELO USU�RIO, CONFORME 
 * EXEMPLO ABAIXO:
 * 
 * MONTAR A TABUADA DE: 5
 * COME�AR POR: 4
 * TERMINAR EM: 7
 * 
 * VOU MONTAR A TABUADA DE 5 COME�ANDO EM 4 E TERMINANDO EM 7:
 * 
 * 5 X 4 = 20
 * 5 X 5 = 25
 * 5 X 6 = 30
 * 5 X 7 = 35
 * 
 * OBS: VOC� DEVE VERIFICAR SE O USU�RIO N�O DIGITOU O FINAL MENOR 
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
		System.out.print("COME�AR POR: ");
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
