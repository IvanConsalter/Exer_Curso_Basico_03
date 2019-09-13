/*
 * O SR. MANOEL JOAQUIM ACABA DE ADQUIRIR UMA PANIFICADORA E PRETENDE 
 * IMPLANTAR A METODOLOGIA DA TABELINHA , J� � UM SUCESSO NA SUA LOJA
 * DE 1,99. VOC� FOI CONTRATADO PARA DESENVOLVER O PROGRAMA QUE MONTA
 * A TABELA DE PRE�OS DE P�ES, DE 1 AT� 50 P�ES, A PARTIR DO PRE�O DO
 * P�O INFORMANDO PELO USU�RIO, CONFORME O EXEMPLO ABAIXO:
 * 
 * PRE�O DO P�O: R$ 0,18
 * PANIFICADORA P�O DE ONTEM - TABELA DE PRE�OS
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
