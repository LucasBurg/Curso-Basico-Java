package br.com.lucasburg.application;

import br.com.lucasburg.oo.Animal;

public class Principal {

	public static void main(String[] args) {
		Animal gato = new Animal();
		
		gato.nome = "Bolinha";
		gato.idade = 8;
		gato.raca = "Amarelo";
		
		System.out.printf("O %s está com fome ? %s", gato.nome, gato.comFome());
		
	}

}
