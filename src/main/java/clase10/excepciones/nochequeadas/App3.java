package clase10.excepciones.nochequeadas;

public class App3 {

	public static void main(String[] args) {
		
		Integer num1 = 10;
		Integer num2 = null;
		
		try {
			System.out.println("resultado: " + (num1 / num2));
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		} 
		
	}

}
