package br.com.lucasburg.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		final String barra = "--------------------------------------------------";
		String[] alunos = new String[3];
		String[] alunos2 = new String[3];
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
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("O aluno %d se chama %s%n", i, alunos[i]);
		}
		
		System.out.println(barra);
		
		System.out.println("Os arrays são iguais ? "+Arrays.equals(alunos, alunos2));
		
		leitor.close();

	}

}
