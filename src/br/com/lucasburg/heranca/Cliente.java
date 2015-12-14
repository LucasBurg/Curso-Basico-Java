package br.com.lucasburg.heranca;

public class Cliente extends Pessoa {
	private int anoIngresso;
	
	public Cliente(){
		super();
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	@Override
	public void printInfos() {
		System.out.printf("%s ingressou em %d%n", super.getNome(), this.getAnoIngresso());
	}
}
