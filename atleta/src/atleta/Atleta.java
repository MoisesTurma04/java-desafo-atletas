package atleta;

import java.util.Locale;
import java.util.Scanner;

public class Atleta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int atletas = 0, homens = 0, mulheres = 0;

		String nome, sexo, nomeAtletaMaisAlto = "";

		double altura = 0.0, peso = 0.0, pesoMedioAtletas = 0.0, atletaMaisAlto = 0.0, porcentagemHomens = 0.0, 
				alturaMediaMulheres = 0.0;

		System.out.println("Qual a quantidade de atletas ? ");
		atletas = sc.nextInt();

		for (int i = 1; i <= atletas; i++) {
			System.out.println("Digite os dados do atleta numero: " + i);
			System.out.println("Digite o Nome: ");
			nome = sc.next();
			System.out.println("Nome: " + nome);

			System.out.println("Digite o sexo: ");
			sexo = sc.next();
			if (sexo.equals("M")) {
				homens++;
				System.out.println("M");
			} else if (sexo.equals("F")) {
				mulheres++;
				System.out.println("F");
			} else {
				while (!sexo.equals("M") && !sexo.equals("F")) {
					System.out.println("Digite o sexo (M/F): ");
					sexo = sc.next();

					if (sexo.equals("M")) {
						System.out.println("M");
					} else {

						System.out.println("Digite para M Masculino ou F Para Feminino");
					}
				}

			}
			;
			System.out.println("Digite a altura (deve ser um valor positivo): ");
			altura = sc.nextDouble();
			System.out.println("Altura: " + altura);

			while (altura == 0 || altura < 0) {
				System.out.println("Valor inválido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
				System.out.println("Altura: " + altura);
			}
			;

			System.out.println("Digite o peso (deve ser um valor positivo): ");
			peso = sc.nextDouble();
			System.out.println("Peso: " + peso);

			while (peso == 0 || peso < 0) {
				System.out.println("Valor inválido! Favor digitar um valor positivo:");
				peso = sc.nextDouble();
				System.out.println("Peso: " + peso);
			}

			pesoMedioAtletas = pesoMedioAtletas + peso / atletas;

			if (altura > atletaMaisAlto) {
				atletaMaisAlto = altura;
				nomeAtletaMaisAlto = nome;
			}
			
			porcentagemHomens = ((double) homens / atletas) * 100.0;

			if (sexo.equals("F")) {
                alturaMediaMulheres += altura;
            }
			

		}
		System.out.println("RELATÓRIO: ");
		System.out.println("Peso médio dos atletas: " + pesoMedioAtletas);
		System.out.printf("Atleta mais alto: %s %n", nomeAtletaMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
		if (mulheres > 0) {
		    alturaMediaMulheres = alturaMediaMulheres / mulheres;
		    System.out.println("Altura média das mulheres: " + alturaMediaMulheres);
		} else {
		    System.out.println("Não há mulheres cadastradas");
		}

		sc.close();
	}

}