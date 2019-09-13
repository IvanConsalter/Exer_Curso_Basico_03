/*
 * FA�A UM PROGRAMA QUE CALCULE O N�MERO M�DIO DE ALUNOS POR TURMA.
 * PARA ISTO, PE�A  A QUANTIDADE DE TURMAS E A QUANTIDADE DE ALUNOS 
 * PARA CADA TURMA. AS TURMAS N�O PODEM TER MAIS DE 40 ALUNOS.
 */
package lista03;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean validarQuantidadeAlunos = false;
		int turmas, alunos, quantidadeAlunos = 0;
		System.out.print("Digite a quantidade de turmas: ");
		turmas = sc.nextInt();
		
		for(int i = 0; i < turmas; i++) {
			
			do {
				System.out.print("Quantidade alunos da Turma" + (i + 1) + ": ");
				alunos = sc.nextInt();
				
				if(alunos > 40) {
					System.out.println("Quantidade m�xima de alunos � 40.");
				}
				else {
					validarQuantidadeAlunos = true;
				}
			}while(validarQuantidadeAlunos == false);
			
			quantidadeAlunos += alunos;
			
		}
		
		//mediaAlunos = quantidadeAlunos / turmas;
		System.out.println("A m�dia de alunos por sala �: " + quantidadeAlunos / turmas + " alunos");
		
		
		
		
		
		sc.close();

	}

}
