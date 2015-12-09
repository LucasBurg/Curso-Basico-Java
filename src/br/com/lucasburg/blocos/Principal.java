package br.com.lucasburg.blocos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome;
		int idade;
		double peso;
		double altura;
		double imc;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é seu nome ?");
		nome = leitor.nextLine();
		
		System.out.println("Qual é sua idade ?");
		idade = Integer.parseInt(leitor.nextLine()); //with cast

		System.out.println("Qual é seu peso ?");
		peso = leitor.nextDouble(); //without cast
		
		System.out.println("Qual é sua altura ?");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		System.out.printf("Nome: %s, Idade: %d, Peso: %.2f, Altura: %.2f%n", nome, idade, peso, altura);
		
		
		if (idade >= 18) {
			System.out.println("Você é de maior!!!");
		} else {
			System.out.println("Você é de menor!!!");
		}
		
		imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é: %.2f :", imc);
		
		if (imc < 16) {
			System.out.println("Magreza grave");
		} else if(imc >= 16 && imc < 17) {
			System.out.println("Magreza moderada");
		} else if(imc >= 17 && imc < 18.5) {
			System.out.println("Magreza leve");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Saudável");
		} else {
			System.out.println("Você está gordinho");
		}
		
		
		
		
	}
}



