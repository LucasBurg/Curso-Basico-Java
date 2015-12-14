package br.com.lucasburg.heranca;

public final class Fisica extends Cliente {
	private String cpf;
	
	public Fisica(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void printInfos(){
		System.out.printf("%s %s ingressou em %d, portador do CPF %s%n", 
				super.getNome(), 
				super.getSobreNome(), 
				this.getAnoIngresso(),
				this.getCpf());
	}
	

}
