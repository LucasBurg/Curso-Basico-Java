package br.com.lucasburg.arrays;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String[] alunos = new String[3];
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("Informe o nome do aluno %d ", i);
			alunos[i] = leitor.nextLine();
		}
		
		
		leitor.close();

	}

}
