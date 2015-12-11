package br.com.lucasburg.statics;

public class Empresa {
	public String nome;
	public int ano;
	public String cnpj;
	public static boolean ativa;
	
	
	public static String cnpj(Empresa empresa){
		return empresa.cnpj;
	}
	
}
