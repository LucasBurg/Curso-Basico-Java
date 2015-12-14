package br.com.lucasburg.threads;

public class Principal {

	public static void main(String[] args) {
		Tabuada tabuada7 = new Tabuada(7);
		Tabuada tabuada13 = new Tabuada(13);
		
		Thread tr1 = new Thread(tabuada7);
		Thread tr13 = new Thread(tabuada13);
		
		tr1.start();
		try {
			tr1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tr13.start();
		
		System.out.println("Final das Threads");
	}

}
