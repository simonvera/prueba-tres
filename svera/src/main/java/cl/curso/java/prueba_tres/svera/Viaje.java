package cl.curso.java.prueba_tres.svera;

import java.util.Date;
/**
 * 
 * @author simon_vera
 *
 */
public class Viaje implements Comparable<Viaje>{
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	/**
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}
	public Viaje(){
		
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}
	/**
	 * @param saldoTarjeta the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
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
	public int compareTo(Viaje viaje) {
		viaje.getFecha().compareTo(getFecha());
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fecha :"+this.getFecha()+" Saldo tarjeta :"+this.getSaldoTarjeta()+" Valor viaje :"+this.getValorViaje();
	}
	
}
