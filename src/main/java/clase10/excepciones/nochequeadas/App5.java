package clase10.excepciones.nochequeadas;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer num1 = 10;
		Integer num2 = 0;

		do {
			
			try {
				System.out.println("Ingrese un valor entero: ");
				num2 = sc.nextInt();

				System.out.println("resultado: " + (num1 / num2));

			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir por cero!");

			} catch (NullPointerException e) {
				System.out.println("No se puede dividir por un valor null!");

			}

		} while (num2 == 0);

	}

}
