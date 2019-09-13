/*
 * FAÇA UM PROGRAMA QUE LEIA E VALIDE AS SEGUINTES INFORMAÇÕES:
 * 1) NOME: MAIOR QUE 3 CARACTERES;
 * 2) IDADE: ENTRE 0 E 150;
 * 3) SALÁRIO: MAIOR QUE ZERO;
 * 4) SEXO: 'F' OU 'M';
 * 5) ESTADO CIVIL: 's', 'c', 'v', 'd';
 */
package lista03;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		boolean validarInformacoes = false;

		System.out.println("Entre com as seguintes informações:");

		do {
			System.out.print("Nome:");
			nome = sc.next();

			if (nome.length() <= 3) {
				System.out.println("Nome precisa ter mais de 3 caracteres.");
				System.out.println("Digite novamente.");
			} else {
				validarInformacoes = true;
			}

		} while (validarInformacoes == false);

		do {
			System.out.print("Idade:");
			idade = sc.nextInt();

			if (idade < 0 || idade > 150) {
				System.out.println("Idade precisa ser entre 0 e 150.");
				System.out.println("Digite novamente.");
				validarInformacoes = false;
			} else {
				validarInformacoes = true;
			}

		} while (validarInformacoes == false);

		do {
			System.out.print("Salário:");
			salario = sc.nextDouble();

			if (salario < 0) {
				System.out.println("Salário não poder ser negativo.");
				System.out.println("Digite novamente.");
				validarInformacoes = false;
			} else {
				validarInformacoes = true;
			}

		} while (validarInformacoes == false);

		do {
			System.out.print("Sexo (f)/(m):");
			sexo = sc.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				validarInformacoes = true;

			} else {
				System.out.println("Sexo deve ser 'F - FEMININO' OU 'M - MASCULINO'.");
				System.out.println("Digite novamente.");
				validarInformacoes = false;
			}

		} while (validarInformacoes == false);
		
		if(sexo.equalsIgnoreCase("f")) {
			sexo = "Feminino";
		}
			else {
				sexo = "Masculino";
			}

		do {
			System.out.print("Estado Civil 's'/'c'/'v'/'d':");
			estadoCivil = sc.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {

				validarInformacoes = true;
			} else {
				System.out.println("Sexo deve ser 'S - SOLTEIRO/A' / 'C - CASADO/A' / 'V - VIÚVO/A' / 'D - DIVORCIADO/A' .");
				System.out.println("Digite novamente.");
				validarInformacoes = false;
			}

		} while (validarInformacoes == false);

		if(estadoCivil.equalsIgnoreCase("s")) {
			estadoCivil = "Solteiro/a";
		}
			else if(estadoCivil.equalsIgnoreCase("c")){
				estadoCivil = "Casado/a";
			}
				else if(estadoCivil.equalsIgnoreCase("v")) {
					estadoCivil = "Viúvo/a";
				}
					else if(estadoCivil.equalsIgnoreCase("d")) {
						estadoCivil = "Divorciado/a";
					}
		
		System.out.println();
		System.out.println("Dados Cadastrados com sucesso.");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$" + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
		
		sc.close();

	}

}
