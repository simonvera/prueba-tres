package cl.curso.java.prueba_tres.svera;
/**
 * 
 * @author simon_vera
 *
 */
public class PagarViaje extends Thread {
	private TarjetaBip tarjetaBip;
	private int valorViaje;
	/**
	 * @param tarjetaBip
	 * @param valorViaje
	 */
	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}
	public PagarViaje(){
		
	}
	/**
	 * @return the tarjetaBip
	 */
	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}
	/**
	 * @param tarjetaBip the tarjetaBip to set
	 */
	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
	}
	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}
	/**
	 * @param valorViaje the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}
	@Override
	public void run() {
		this.getTarjetaBip().pagarViaje(valorViaje);
		
		super.run();
	}
}
