package br.com.lucasburg.application;

import br.com.lucasburg.oo.Animal;
import br.com.lucasburg.statics.Empresa;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Utilizado para o pacote oo
		 */
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
		
		Empresa empresa1 = new Empresa();
		
		empresa1.nome = "Buum Digital";
		empresa1.ano  = 2013;

		System.out.println("Nome da empresa: " + empresa1.nome + " Ano: " +empresa1.ano + " Ativa: " + Empresa.ativa);
		
		Empresa empresa2 = new Empresa();
		
		empresa2.nome = "Circulos";
		empresa2.ano  = 2015;
		
		System.out.println("Nome da empresa: " + empresa2.nome + " Ano: " +empresa2.ano + " Ativa: " + Empresa.ativa);

		
	}

}
