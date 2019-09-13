/*
 * FAÇA UM PROGRAMA QUE LEIA UM NOME DE USUÁRIO E A SUA SENHA
 * E NÃO ACEITE A SENHA IGUAL AO NOME DO USUÁRIO, MOSTRANDO UMA 
 * MENSAGEM DE ERRO E VOLTANDO A PEDIR AS INFORMAÇÕES.
 */
package lista03;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean validarSenha = false;
		
		System.out.print("Insira nome usuário: ");
		String nome = sc.next();
		System.out.print("Insira uma senha: ");
		String senha = sc.next();
		
		do {
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual ao nome do usuário.");
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
