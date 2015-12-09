package br.com.lucasburg.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<String>();
		Set<String> animais = new HashSet<String>();
		
		Map<String, Integer> notas = new HashMap<String, Integer>();
		
		
		Scanner leitor = new Scanner(System.in);
		String nome = "sair";
		int sizeAlunos = 0;
		int sizeAnimais = 0;
		
		String status = "Sim";
		
		boolean continuar = true;
		
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
		
		nome = "sair";
		
		do {
			System.out.println("Informe o nome do animal: ");
			nome = leitor.nextLine();
			if (!nome.equals("sair")) {
				animais.add(nome);
			}
		} while(!nome.equals("sair"));
		
		sizeAnimais = animais.size();
		
		Iterator<String> it = animais.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		while (continuar) {
		
			System.out.print("Informe o nome do aluno: ");
			nome = leitor.nextLine();
			
			System.out.print("Informe a nota do aluno: ");
			notas.put(nome, Integer.parseInt(leitor.nextLine()));
			
			System.out.print("Para continuar Digite 'Sim' ou qualquer tecla para sair: ");
			status = leitor.nextLine();
			
			continuar = (status.equals("Sim")) ? true : false;
		}
		
		
		for (String item : notas.keySet()) {
			System.out.println(item +" = "+ notas.get(item));
		}
		
		
		System.out.println("----------------------------------fim");
		
		leitor.close();
		
		
		
		
	}
}
