/*
 * FA�A UM PROGRAMA QUE PE�A PARA 'N' PESSOAS A SUA IDADE, AO FINAL O
 * PROGRAMA DEVERA VERIFICAR SE A M�DIA DE IDADE DA TURMA VARIA ENTRE 
 * 0 E 25, 26 E 60 E MAIOR QUE 60; E ENT�O, DIZER SE A TURMA � JOVEM,
 * ADULTA OU IDOSA, CONFORME A M�DIA CALCULADA.
 */
package lista03;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resposta, quantidadePessoas = 0, joven = 0, adulto = 0, idoso = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Qual sua idade?: ");
			resposta = sc.nextInt();
			quantidadePessoas += 1;
			
			if(resposta >= 0 && resposta <= 25) {
				joven += 1;
			} else if(resposta > 25 && resposta <= 60) {
					adulto += 1;
				} else {
					idoso += 1;
				}
		}
		
		System.out.println("Foram entrevistados " + quantidadePessoas + " pessoas.");
		System.out.println(joven + " Jovens");
		System.out.println(adulto + " Adultos");
		System.out.println(idoso + " Idosos");
		
		
		
		sc.close();

	}

}
