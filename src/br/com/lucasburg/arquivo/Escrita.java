package br.com.lucasburg.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Escrita {

	private String texto;

	private IArquivo arquivo;

	public Escrita(IArquivo arquivo) {
		this.arquivo = arquivo;
	}

	public void setTexto(ITexto texto) {
		this.texto = texto.getTexto();
	}

	public void comOutputStream() {
		File arquivo = this.arquivo.criar("arquivo_output_stream.txt");
		OutputStream stream = null;
		try {
			stream = new FileOutputStream(arquivo);
			stream.write(texto.getBytes(), 0, texto.length());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("O arquivo existe: " + arquivo.exists());
		System.out.println("É possivel escrever no arquivo: " + arquivo.canWrite());
		System.out.println("Tamanho do arquivo: " + arquivo.length());

	}

	public void comFiles() {
		File arquivo = this.arquivo.criar("arquivo_files.txt");
		try {
			Files.write(Paths.get(arquivo.getAbsolutePath()), texto.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("O arquivo existe: " + arquivo.exists());
		System.out.println("É possivel escrever no arquivo: " + arquivo.canWrite());
		System.out.println("Tamanho do arquivo: " + arquivo.length());

	}

	public void comBufferedWriter() {
		File arquivo = this.arquivo.criar("arquivo_buffer.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(arquivo);
			bw = new BufferedWriter(fw);
			bw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("O arquivo existe: " + arquivo.exists());
		System.out.println("É possivel escrever no arquivo: " + arquivo.canWrite());
		System.out.println("Tamanho do arquivo: " + arquivo.length());

	}

	public void comFileWriter() {
		File arquivo = this.arquivo.criar("arquivo_writer.txt");
		Writer stream = null;
		try {
			stream = new FileWriter(arquivo);
			stream.write(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("O arquivo existe: " + arquivo.exists());
		System.out.println("É possivel escrever no arquivo: " + arquivo.canWrite());
		System.out.println("Tamanho do arquivo: " + arquivo.length());
	}

}
