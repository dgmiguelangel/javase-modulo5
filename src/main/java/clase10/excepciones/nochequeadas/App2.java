package clase10.excepciones.nochequeadas;

public class App2 {

	public static void main(String[] args) {
		
		Integer num1 = 10;
		Integer num2 = 2;
		
		try {
			System.out.println("resultado: " + (num1 / num2));
		
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir por cero!");
		
		} catch (NullPointerException e) {
			System.out.println("No se puede dividir por un valor null!");
		
		} finally {
			System.out.println("Siempre se ejecuta!");
		}
		
	}

}
