package io.github.jovitordev.controller;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeArquivo {

	public static void main(String[] args) {
		// o objeto file ira encapsular todo processo de acessar o arquivo e caminho
		File file = new File("C:\\Users\\re039856\\eclipse-workspace\\test.txt");
		Scanner sc = null;
		// quando instanciar o Scanner a partir do arquivo file o programa tentara abrir
		// o arquivo gerando uma exceção do tipo IOException
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // testar se ainda há uma proxima linha no arquivo se sim, imprimi-la
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally { // fechamento no finally boa pratica
			if (sc != null) {
				sc.close();
			}
		}
	}
}
