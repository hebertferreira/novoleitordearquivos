package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		/* FILEREADER tem o objetivo de fazer a leitura de um arquivo(Leitura de caracteres),
		 * READREADER tem o objetivo de fazer a leitura de um arquivo de forma mais rapida, 
		 * contudo ele é instanciado a paritr do FILEREADER, fazendo esse leitura até mais rapida
		 */
		
		String caminho = "/home/oberon/arquivo.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			//Readline tem o objetivo de ler uma linha do arquivo
			String linha =br.readLine(); 
			
			//Enquanto a linha não for nula, mostra a linha atual e segue para ler a proxima linha
			while(linha !=null) {
				System.out.println(linha);
				linha = br.readLine();	
			}
					
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
			
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
