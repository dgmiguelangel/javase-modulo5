package clase10.excepciones.throws_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		try {
			leerArchivo();
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
		
	}

	private static void leerArchivo() throws FileNotFoundException {

		File file = new File("archivo2.txt");
		Scanner sc = new Scanner(file);

		do {
			String linea = sc.nextLine();
			System.out.println(linea);

		} while (sc.hasNextLine());
		
		sc.close();

	}

}
