/*
 * O CARDÁPIO DE UMA LANCHONETE É O SEGUINTE:
 * 
 * ESPECIFICAÇÃO            CÓDIGO       PREÇO
 * 
 * CACHORRO QUENTE          100          R$ 1,20
 * BAURU SIMPLES            101          R$ 1,30 
 * BAURU COM OVO            102          R$ 1,50
 * HAMBÚRGUER               103          R$ 1,20
 * CHEESEBURGUER            104          R$ 1,30
 * REFRIGERANTE             105          R$ 1,00
 * 
 * FAÇA UM PROGRAMA QUE LEIA O CÓDIGO DOS ITENS PEDIDOS E AS
 * QUANTIDADES DESEJADAS.CALCULE E MOSTRE O VALOR A SER PAGO
 * POR ITEM (PREÇO * QUANTIDADE) E O TOTAL GERAL DO PEDIDO.
 * CONSIDERE QUE O CLIENTE DEVE INFORMAR QUANDO O PEDIDO DEVE
 * SER ENCERRADO.
 */
package lista03;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int quantidade = 0, cod;
		boolean sair = false;
		String nome = "";
		
		
		
		do {
			System.out.print("Entre com o COD (0 PARA SAIR): ");
			cod = sc.nextInt();
			if(cod == 0) {
				sair = true;
				break;
			}
			System.out.print("Entre com a quantidade: ");
			quantidade = sc.nextInt();
			
			switch (cod) {
			case 100:                                     
				nome += quantidade + "X CACHORRO-QUENTE = " + (1.2 * quantidade) + "\n";
				total += 1.2 * quantidade;
				break;
			case 101:
				nome += quantidade + "X BAURU-SIMPLES = " + (1.3 * quantidade) + "\n";
				total += 1.3 * quantidade;
				break;
			case 102:
				nome += quantidade + "X BAURU-COM-OVO = " + (1.5 * quantidade) + "\n";
				total += 1.5 * quantidade;
				break;
			case 103:
				nome += quantidade + "X HAMBÚRGUER = " + (1.2 * quantidade) + "\n";
				total += 1.2 * quantidade;
				break;
			case 104:
				nome += quantidade + "X CHEESEBURGUER = " + (1.3 * quantidade) + "\n";
				total += 1.3 * quantidade;
				break;
			case 105:
				nome += quantidade + "X REFRIGERANTE = " + (1 * quantidade) + "\n";
				total += 1 * quantidade;
				break;
			
			}
				
		
		}while(sair == false);
		
		System.out.print(nome);
		System.out.println("Total = " + total);
		
		sc.close();
		

	}

}
