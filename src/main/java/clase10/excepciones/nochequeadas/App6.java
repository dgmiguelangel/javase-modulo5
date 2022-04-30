package clase10.excepciones.nochequeadas;

import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num1 = null;

		try {
			System.out.println("Ingrese un valor entero: ");
			num1 = sc.next();
			Integer.parseInt(num1);
			System.out.println(num1);

		} catch (NumberFormatException e) {
			System.out.println("Debe ingresar un valor numerico");

		} finally {
			sc.close();
		}

	}

}
