package clase10.excepciones.chequeadas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("archivo.txt");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				if (fr != null)
					fr.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
