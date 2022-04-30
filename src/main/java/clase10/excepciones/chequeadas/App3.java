package clase10.excepciones.chequeadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		
		File file = new File("archivo.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			do {
				String linea = sc.nextLine();
				System.out.println(linea);
				
			} while(sc.hasNextLine());			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		
		} finally {
			sc.close();
		}

	}

}
