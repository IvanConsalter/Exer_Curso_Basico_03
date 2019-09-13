/*
 * UM FUNCION�RIO DE UMA EMPRESA RECEBE AUMENTO SALARIAL ANUALMENTE:
 * SABE-SE QUE:
 * 			ESSE FUNCION�RIO FOI CONTRATADO EM 1995, COM SAL�RIO
 * 			INICIAL DE R$1.000,00;
 * 
 * A) EM 1996 RECEBEU AUMENTO DE 1,5% SOBRE SEU SAL�RIO INICIAL;
 * 
 * B) A PARTIR DE 1997 (INCLUSIVE), OS AUMENTOS SALARIAIS SEMPRE 
 * CORRESPONDEM AO DOBRO DO PERCENTUAL DO ANO ANTERIOR. FA�A UM 
 * PROGRAMA QUE DETERMINE O SAL�RIO ATUAL DESSE FUNCION�RIO. AP�S
 * CONCLUIR ISTO, ALTERE O PROGRAMA PERMITINDO QUE O USU�RIO DIGITE 
 * O SAL�RIO INCIAL DO FUNCION�RIO.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		double salario;
		double porcentagem = 1.5;
		int  anoAtual;
		System.out.print("Ano Atual: ");
		anoAtual = sc.nextInt();
		System.out.print("Sal�rio: ");
		salario = sc.nextDouble();
		
		
		salario += (salario / 100) * porcentagem;
		
		for(int i = 1997; i <= anoAtual; i++) {
			
			porcentagem *= 2;
			salario += (salario / 100) * porcentagem;
			
			
			System.out.println(i + " : " + df.format(salario) + "--- " + porcentagem + "%");
		}
		
		
		
		sc.close();
		
	}

}
