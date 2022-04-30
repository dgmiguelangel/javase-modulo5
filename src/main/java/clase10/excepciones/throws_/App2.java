package clase10.excepciones.throws_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
		try {
			leerArchivo();
			guardar();
			
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println("se produjo una excepcion " + e.getMessage());			
		} 
		
	}
	
	
	private static void guardar() throws ClassNotFoundException {
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
	}

	private static void leerArchivo() throws FileNotFoundException {

		File file = new File("archivo.txt");
		Scanner sc = new Scanner(file);

		do {
			String linea = sc.nextLine();
			System.out.println(linea);

		} while (sc.hasNextLine());
		
		sc.close();

	}

}
