package clase10.excepciones.nochequeadas;

public class App4 {

	public static void main(String[] args) {

		int numeros[] = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= numeros.length; i++) {
				System.out.println(numeros[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Intento acceder a una posicion inexistente...");
		}

	}

}
