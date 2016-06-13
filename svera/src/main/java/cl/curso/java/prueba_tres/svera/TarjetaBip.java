package cl.curso.java.prueba_tres.svera;

import java.util.Collections;
import java.util.List;
/**
 * 
 * @author simon_vera
 *
 */
public class TarjetaBip {
	private int numeroTarjeta;
	private int saldo;
	private List<Viaje>viajes;
	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}
	public TarjetaBip(){
		
	}
	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}
	/**
	 * @param viajes the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	public void recargar(int monto){
		this.setSaldo(this.getSaldo()+monto);
		System.out.println("Saldo actual :"+this.getSaldo());
	}
	public synchronized void pagarViaje(int valorViaje){
		if(this.getSaldo()<valorViaje){
			throw new SinSaldoException("Saldo insuficiente en tarjeta");
		}else{
			if(this.getSaldo()>=valorViaje){
				this.setSaldo(this.getSaldo()-valorViaje);
				this.getViajes().add(new Viaje());
			}
		}
	}
	public void imprimir(){
		Collections.sort(this.getViajes());
		for(Viaje viajes:this.getViajes()){
			System.out.println(viajes.toString());
		}
	}
}
