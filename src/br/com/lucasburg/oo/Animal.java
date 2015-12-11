package br.com.lucasburg.oo;

public class Animal {
	
	private String nome;
	
	private String raca;
	
	private String especie;
	
	private int idade;
	
	private boolean estaDormindo;
	
	private boolean comFome;
	
	private double peso;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (nome.trim().isEmpty()) {
			throw new Exception("O parametro nome não pode sem vazio.");
		}
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isEstaDormindo() {
		return estaDormindo;
	}
	
	public void setEstaDormindo(boolean estaDormindo) {
		this.estaDormindo = estaDormindo;
	}

	public boolean isComFome() {
		return comFome;
	}
	
	public void setComFome(boolean comFome) {
		this.comFome = comFome;
	}

	public void printStatusFome(){
		String fome = (isComFome()) ? "Sim" : "Não";
		System.out.printf("O %s chamado %s está com fome ? %s", especie, nome, fome);
	}
	
}
