package clase10.excepciones.throw_;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		
		System.out.println("Ingrese un valor");
		num1 = sc.nextInt();
		
		try {
			if(num1 < 0) {
				throw new Exception("No puede ingresar valores negativos!");				
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		} finally {
			sc.close();			
		}		

	}

}
