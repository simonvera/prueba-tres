package cl.curso.java.prueba_tres.svera;
/**
 * 
 * @author simon_vera
 *
 */
public class SinSaldoException extends RuntimeException {

	/**
	 * @param arg0
	 */
	public SinSaldoException(String arg0) {
		super(arg0);
		System.out.println("Saldo insuficiente en tarjeta");
	}
	
}
