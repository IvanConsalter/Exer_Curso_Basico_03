/*
 * FA�A UM PROGRAMA QUE LEIA UM NOME DE USU�RIO E A SUA SENHA
 * E N�O ACEITE A SENHA IGUAL AO NOME DO USU�RIO, MOSTRANDO UMA 
 * MENSAGEM DE ERRO E VOLTANDO A PEDIR AS INFORMA��ES.
 */
package lista03;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean validarSenha = false;
		
		System.out.print("Insira nome usu�rio: ");
		String nome = sc.next();
		System.out.print("Insira uma senha: ");
		String senha = sc.next();
		
		do {
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual ao nome do usu�rio.");
				System.out.println("Digite uma nova senha");
				System.out.print("Insira uma senha: ");
				senha = sc.next();
			}
			else {
				System.out.println("Senha cadastrada com sucesso.");
				validarSenha = true;
			}
			
		}while(validarSenha == false);
		
		
		
		sc.close();

	}

}
