package clase11.excepciones.propias;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		
		System.out.println("Ingrese un valor");
		num1 = sc.nextInt();
		
		try {
			if(num1 < 0) {
				throw new PropiaException(2);				
			}
		
		} catch (PropiaException e) {
			System.out.println(e.getMessage());
		
		} finally {
			sc.close();			
		}		

	}

}
