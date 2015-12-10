package br.com.lucasburg.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		double result = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe dois numeros para divisão.");
		
		try {
			
			a = lerNumero(leitor, "Número 1: ");
			
			b = lerNumero(leitor, "Número 2: ");
			
			result = dividir(a, b);
		
		} catch (ArithmeticException ex) {
		
			System.out.println(ex.toString());
		
		} catch (InputMismatchException ex) {
			
			System.out.println(ex.toString());
			
		} catch (Exception ex) {
			
			System.out.println(ex.toString());
		
		} finally {
		
			System.out.println("Ótimo terminamos a exception.");
		
		}
		
		
		
		System.out.println("Resultado: " + result);
				
		leitor.close();
		
	}
	
	
	private static int dividir(int value1, int value2) {
		return value1 / value2;
	}
	
	private static int lerNumero(Scanner leitor, String label) {
		System.out.println(label);
		return leitor.nextInt();
	}

}
