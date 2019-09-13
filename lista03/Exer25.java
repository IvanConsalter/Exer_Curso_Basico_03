/*
 * O SR. MANOEL JOAQUIM EXPANDIU SEUS NEGÓCIOS PARA ALÉM DOS
 * NEGÓCIOS DE 1,99 E AGORA POSSUI UMA LOJA DE CONVENIÊNCIAS.
 * FAÇA UM PROGRAMA QUE IMPLEMENTE UMA CAIXA REGISTRADORA 
 * RUDIMENTAR. O PROGRAMA DEVERÁ RECEBER UM NÚMERO DESCONHECIDO
 * DE VALORES REFERENTES AOS PREÇOS DAS MERCADORIAS. UM VALOR 
 * ZERO DEVE SER INFORMADO PELO OPERADOR PARA INDICAR O FINAL 
 * DA COMPRA. O PROGRAMA DEVE ENTÃO MOSTRAR O TOTAL DA COMPRA 
 * E PERGUNTAR O VALOR EM DINHEIRO QUE O CLIENTE FORNECEU, PARA 
 * ENTÃO CALCULAR E MOSTRAR O VALOR DO TROCO.
 * APÓS ESTA OPERAÇÃO, O PROGRAMA DEVERÁ VOLTA AO PONTO INICIAL,
 * PARA REGISTRAR A PRÓXIMA COMPRA. A SAÍDA DEVE SER  CONFORME O
 * EXEMPLO ABAIXO:
 * 
 * LOJAS TABAJARA
 * 
 * PRODUTO 1: R$ 2,20
 * PRODUTO 2: R$ 5,80
 * PRODUTO 3: R$ 0,00
 * 
 * TOTAL: R$ 8,00
 * DINHEIRO: R$ 20,00
 * TROCO: R$ 12,00
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		
		int i = 1;
		double preco, total = 0, dinheiro, troco;
		boolean voltar = false;
		
		do {
			System.out.println("Caixa Aberto!");
			System.out.println("Para fechar digite: 0");
			
			do {
				System.out.print("PRODUTO " + i + ": R$ ");
				preco = sc.nextDouble();
				i += 1;
				total += preco;
				
			}while(preco != 0);
			
			System.out.println("TOTAL: R$ " + df.format(total));
			System.out.print("DINHEIRO: R$ " );
			dinheiro = sc.nextDouble();
			
			while(dinheiro < total) {
				System.out.println("---------------------------------------");
				System.out.println("DINHEIRO INSUFICIENTE. FAVOR CONFIRMAR!");
				System.out.println("---------------------------------------");
				System.out.println("TOTAL: R$ " + df.format(total));
				System.out.print("DINHEIRO: R$ " );
				dinheiro = sc.nextDouble();
			}
			
			troco = (dinheiro - total);
			
			System.out.println("TROCO: R$ " + df.format(troco));
			
			i = 1;
			total = 0;
			System.out.println();
			System.out.println("-----------------------------------------------");
			
		}while(voltar == false);
		
		
		
		sc.close();

	}

}
