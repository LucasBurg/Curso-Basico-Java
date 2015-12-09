package br.com.lucasburg.excecoes;

public class Principal {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 0;
		double result = 0;
		
		
		
		try {
			result = dividir(b, c);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		
		
		System.out.print(result);
				

	}
	
	
	static int dividir(int value1, int value2) throws Exception {
		return value1 / value2;
	}

}
