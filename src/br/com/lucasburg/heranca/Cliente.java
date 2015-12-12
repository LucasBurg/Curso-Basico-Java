package br.com.lucasburg.heranca;

public class Cliente {
	private int id;
	private String nome;
	private int anoIngresso;
	private boolean ativo;
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAnoIngresso() {
		return anoIngresso;
	}
	
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	} 
	
}
