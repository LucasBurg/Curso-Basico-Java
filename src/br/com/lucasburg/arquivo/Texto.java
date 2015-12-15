package br.com.lucasburg.arquivo;

public class Texto implements ITexto {
	private String texto;
	
	@Override
	public String getTexto() {
		return this.texto;
	}

	@Override
	public void setTexto(String texto) {
		this.texto = texto;
	}
}
