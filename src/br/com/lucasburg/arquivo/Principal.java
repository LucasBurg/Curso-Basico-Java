package br.com.lucasburg.arquivo;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Estudo de escrita e leitura de arquivos");
		
		Arquivo arquivo = new Arquivo();
		
		Texto texto = new Texto();
		
		Escrita escrita = new Escrita(arquivo);
		
		texto.setTexto("Ol� mundo doido");
		escrita.setTexto(texto);
		escrita.comOutputStream();
		escrita.comFiles();
		
		texto.setTexto("Hoje � ter�a-feira");
		escrita.setTexto(texto);
		escrita.comBufferedWriter();
		escrita.comFileWriter();
		
		
		System.out.println("*** leitura de arquivos ****");
		Leitura leitor = new Leitura(arquivo);
		leitor.comInputStream();
		leitor.comFiles();
	}

}
