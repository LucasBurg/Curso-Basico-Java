package br.com.lucasburg.arquivo;

import java.io.File;

public interface IArquivo {
	File criar(String nomeArquivo);
	File get(String nomeArquivo) throws Exception;
}

