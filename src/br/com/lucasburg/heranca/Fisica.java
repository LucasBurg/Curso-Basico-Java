package br.com.lucasburg.heranca;

public class Fisica extends Cliente {
	private String cpf;
	
	
	public Fisica(String cpf, String nome) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
