package clase11.excepciones.propias;

public class PropiaException extends Exception {

	private int codigo;

	public PropiaException(int codigo) {
		super();
		this.codigo = codigo;
	}

	public PropiaException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		switch (codigo) {
			case 1:
				return "El valor ingresado no puede ser cero";			
			case 2:
				return "El valor ingresado no puede ser negativo";
			default:
				return super.getMessage();
		}
	}
	
}
