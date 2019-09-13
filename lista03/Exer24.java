/*
 * O SR. MANOEL JOAQUIM ACABA DE ADQUIRIR UMA PANIFICADORA E PRETENDE 
 * IMPLANTAR A METODOLOGIA DA TABELINHA , JÁ É UM SUCESSO NA SUA LOJA
 * DE 1,99. VOCÊ FOI CONTRATADO PARA DESENVOLVER O PROGRAMA QUE MONTA
 * A TABELA DE PREÇOS DE PÂES, DE 1 ATÉ 50 PÃES, A PARTIR DO PREÇO DO
 * PÃO INFORMANDO PELO USUÁRIO, CONFORME O EXEMPLO ABAIXO:
 * 
 * PREÇO DO PÃO: R$ 0,18
 * PANIFICADORA PÃO DE ONTEM - TABELA DE PREÇOS
 * 1 - R$ 0,18
 * 2 - R$ 0,36
 * ...
 * 50 - R$ 9,00
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco = 0.18;
		DecimalFormat df = new DecimalFormat("###.##");

		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) + " - R$ " + df.format(preco));
			preco += 0.18;
		}

		sc.close();

	}

}
