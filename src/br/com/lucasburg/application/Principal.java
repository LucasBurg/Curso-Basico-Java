package br.com.lucasburg.application;

import br.com.lucasburg.oo.Animal;

public class Principal {

	public static void main(String[] args) {
		try {
			Animal gato = new Animal();
			gato.setEspecie("Gato");
			gato.setNome("Malhado");
			gato.setIdade(8);
			gato.setRaca("Amarelo");
			gato.setComFome(true);
			gato.printStatusFome();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
