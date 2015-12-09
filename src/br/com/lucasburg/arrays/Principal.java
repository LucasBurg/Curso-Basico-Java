package br.com.lucasburg.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		final String barra = "--------------------------------------------------";
		String[] alunos  = new String[3];
		String[] alunos2 = new String[3];
		String[] alunos3 = new String[3];
		int indiceMaria;
		
		alunos3[0] = "Mateus";
		alunos3[1] = "Ana";
		alunos3[2] = "Dilma";
		
		Scanner leitor = new Scanner(System.in);
		
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("Informe o nome do aluno %d: ", i);
			alunos[i] = leitor.nextLine();
			alunos2[i] = alunos[i];
		}
		
		System.out.println(barra);
		
		//Arrays.fill(alunos, "Nenhum");
		
		Arrays.sort(alunos);
		Arrays.sort(alunos2);
		Arrays.sort(alunos3);
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("O aluno %d se chama %s%n", i, alunos[i]);
		}
		
		System.out.println(barra);
		
		System.out.println("Os arrays são iguais ? "+Arrays.equals(alunos, alunos2));
		
		System.out.println(barra);
		
		indiceMaria = Arrays.binarySearch(alunos, "Maria");
		
		System.out.println("Procurar por Maria... seu indice é: " + indiceMaria);
		
		if (indiceMaria >= 0) {
			System.out.println(barra);
			System.out.println("Copiar Maria...");
			System.arraycopy(alunos, indiceMaria, alunos3, 0, 1);
		}
		
		System.out.println(barra);
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("O aluno %d se chama %s / O aluno3 %d se chama %s %n", i, alunos[i], i, alunos3[i]);
		}
		
		
		
		leitor.close();

	}

}
