package br.com.lucasburg.arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Leitura {

	private IArquivo arquivo;
	
	public Leitura(IArquivo arquivo) {
		this.arquivo = arquivo;
	}
	
	public void comInputStream() {
		File arquivo = null;
		try {
			arquivo = this.arquivo.get("arquivo_output_stream.txt");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
			InputStream is = null;
			
			try {
				is = new FileInputStream(arquivo);
				
				byte[] conteudo = new byte[100];
				
				is.read(conteudo);
				
				String conteudoExtraido = new String(conteudo);
				
				System.out.println("*** conteúdo do arquivo " + arquivo.getName());
				System.out.println(conteudoExtraido);
				System.out.println("********");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
		
		
	}
	
	public void comFiles() {
		File arquivo = null;
		try {
			arquivo = this.arquivo.get("arquivo_buffer.txt");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			String conteudo = new String(Files.readAllBytes(Paths.get(arquivo.getAbsolutePath())));
			
			System.out.println("*** conteúdo do arquivo " + arquivo.getName());
			System.out.println(conteudo);
			System.out.println("********");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
