package br.edu.infnet.mario.pagnozzi;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class loader implements ApplicationRunner{
	
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		while (linha != null) {
			
			String[] campos = linha.split(";");
			
			switch (campos[0].toUpperCase()) {
				case "V":
				
					break;
				case "A":
					
					break;
				case "E":
					
					break;
				default:
					break;
				
			}
			System.out.println(linha);
			linha = leitura.readLine();
			
		}
		
		leitura.close();
	}
}
