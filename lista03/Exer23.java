/*
 * O SR. MANOEL JOAQUIM POSSUI UMA GRANDE LOJA DE ARTIGOS DE R$1,99
 * COM CERCA DE 10 CAIXAS. PARA AGILIZAR O CÁLCULO DE QUANTO CADA 
 * CLIENTE DEVE PAGAR ELE DESENVOLVEU UMA TABELA QUE CONTÉM O NÚMERO
 * DE ITENS QUE O CLIENTE COMPROU E AO LADO O VALOR DA CONTA. DESTA 
 * FORMA A ATENDENTE DO CAIXA PRECISA APENAS CONTAR QUANTOS ITENS
 * O CLIENTE ESTÁ LEVANDO E OLHAR NA TABELA DE PREÇOS. VOCÊ FOI 
 * CONTRATADO PARA DESENVOLVER O PROGRAMA QUE MONTA ESTA TABELA DE 
 * PREÇOS, QUE CONTERÁ OS PREÇOS DE 1 ATÉ 50 PRODUTOS, CONFORME O 
 * EXEMPLO ABAIXO:
 * 
 * LOJAS QUASE DOIS - TABELA DE PREÇOS
 * 1 - R$ 1,99
 * 2 - R$ 3,98
 * ...
 * 50 - R$ 99,50
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 1.99;
		DecimalFormat df = new DecimalFormat("###.##");
		
		for (int i = 0; i < 50; i++ ) {
			System.out.println((i + 1) + " - R$ " + df.format(preco));
			preco += 1.99;
		}
		
		
		sc.close();

	}

}
