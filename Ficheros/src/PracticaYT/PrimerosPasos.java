package PracticaYT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrimerosPasos {
	

public static void main(String[] args) {
	

	try {
	
	FileWriter escritor = new FileWriter("ficheroPYT.txt");
	
	escritor.write("Hola");
	escritor.close();
	
	}catch(IOException ex) {
		
		ex.printStackTrace();
		
		}
	
	try {
		FileReader lector = new FileReader("ficheroPYT.txt");
		BufferedReader br = new BufferedReader(lector);
		
		try {
			
				System.out.println(br.readLine());
				br.close();
				lector.close();
				
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	}
}
