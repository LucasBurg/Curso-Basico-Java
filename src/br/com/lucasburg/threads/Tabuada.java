package br.com.lucasburg.threads;

public class Tabuada implements Runnable {
	private int de;
	
	public Tabuada(int de){
		this.de = de;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++){
			System.out.printf("%d x %d = %d%n", i, this.de, i * this.de);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
