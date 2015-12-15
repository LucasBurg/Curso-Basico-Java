package br.com.lucasburg.arquivo;

import java.io.File;
import java.io.IOException;

public class Arquivo implements IArquivo {

	@Override
	public File criar(String nomeArquivo) {
		File arquivo = new File(nomeArquivo);
		if (arquivo.exists()) {
			return arquivo;
		}
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arquivo;
	}

	public File get(String nomeArquivo) throws Exception {
		File arquivo = new File(nomeArquivo);
		if (arquivo.exists()) {
			return arquivo;
		}
		throw new Exception("O arquivo não existe.");
	}

}
