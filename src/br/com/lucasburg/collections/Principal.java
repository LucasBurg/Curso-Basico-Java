package br.com.lucasburg.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<String>();
		Scanner leitor = new Scanner(System.in);
		String nome = "sair";
		int sizeAlunos = 0;
		
		do {
			
			System.out.println("Informe o nome do aluno: ");
			nome = leitor.nextLine();
			
			if (!nome.equals("sair")) {
				alunos.add(nome);
			}
			
			
		} while(!nome.equals("sair"));
		
		
		sizeAlunos = alunos.size();
		
		for (int i = 0; i < sizeAlunos; i++) {
			System.out.println(alunos.get(i));
		}
		
		
		leitor.close();
		

	}

}
