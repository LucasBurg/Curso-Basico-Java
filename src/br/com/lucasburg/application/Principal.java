package br.com.lucasburg.application;

import br.com.lucasburg.classes.PrincipaisClasses;
import br.com.lucasburg.conexao.Conexao;
import br.com.lucasburg.heranca.Cliente;
import br.com.lucasburg.heranca.Fisica;
import br.com.lucasburg.heranca.Juridica;
import br.com.lucasburg.heranca.Pessoa;
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
			gato.fazerBarulho();
			gato.fazerBarulho("Miauu Miauuu");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----------------------------------------------");
		
		Empresa empresa1 = new Empresa();
		empresa1.nome = "Buum Digital";
		empresa1.ano  = 2013;
		System.out.println("Nome da empresa: " + empresa1.nome + " Ano: " +empresa1.ano + " Ativa: " + Empresa.ativa);
		
		Empresa empresa2 = new Empresa();
		empresa2.nome = "Circulos";
		empresa2.ano  = 2015;
		empresa2.cnpj = "123.123.123 000 /";
		System.out.println("Nome da empresa: " + empresa2.nome + " Ano: " +empresa2.ano + " Ativa: " + Empresa.ativa);

		/**
		 * Método estatico
		 */
		System.out.println(Empresa.cnpj(empresa2));
		System.out.println("-----------------------------------------------");
		
		/**
		 * Construtor
		 */
		Conexao conexao = new Conexao("done");
		System.out.println(conexao.status);
		System.out.println("-----------------------------------------------");
		
		/**
		 * Herança
		 * Fisica extends Cliente
		 */
		System.out.println("-----------------------------------------------");
		
		
		Fisica pessoa = new Fisica("064.807.259-21");
		pessoa.setNome("Lucas");
		pessoa.setAnoIngresso(2013);
		pessoa.setSobreNome("Burg");
		pessoa.setSexo("M");
		pessoa.printInfos();
		
		System.out.println("-----------------------------------------------");
		
		Juridica fornecedor = new Juridica();
		fornecedor.setCnpj("33.818.136/0001-62");
		fornecedor.setNome("Buum Digital");
		fornecedor.setAnoIngresso(1990);
		fornecedor.printInfos();
		
		System.out.println("-----------------------------------------------");
		
		/**
		 * Polimorfismo 
		 */
		Pessoa cliente = new Cliente();
		
		cliente.setNome("Lucas");
		//cliente.setAnoIngresso(2010);
		cliente.setId(39429);
		cliente.setSexo("M");
		cliente.printInfos();
		
		/**
		 * Teste das principais classes
		 */
		System.out.println("================================================");
		PrincipaisClasses teste = new PrincipaisClasses();
		teste.testInt();
		System.out.println("================================================");
		teste.testDouble();
		
		
	}

}
