package clase11.exepciones.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		File file = new File("archivo.txt");
		
		try (Scanner sc = new Scanner(file);){
			
			do {
				String linea = sc.nextLine();
				System.out.println(linea);
				
			} while(sc.hasNextLine());
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}

	}

}
