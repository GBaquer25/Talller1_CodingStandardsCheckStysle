package Estimador;

/**
 * Clase estimador
 * @author Baquerizo Anastacio Génesis 
 */

public class Vacaciones {
	
	private String destino;
	private int totalViajantes;
	private int diasDeViaje;
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		
		this.destino = destino.toUpperCase();
	}
	
	public int getTotalViajantes() {
		
		return totalViajantes;
	}
	
	public void setTotalViajantes(int totalViajantes) {
		
		this.totalViajantes = totalViajantes;
	}
	
	public int getDiasDeViaje() {
		
		return diasDeViaje;
	}
	
	public void setDiasDeViaje(int diasDeViaje) {
		
		this.diasDeViaje = diasDeViaje;
	}

	private double costoTotal = 0;
	private double precioBase = 1000;
	private double descuento;

	public Vacaciones() {
		
	}
	
	public Vacaciones(String destino, int totalViajantes, int diasDeViaje) {
		
		this.destino = (destino);
		this.totalViajantes = totalViajantes;
		this.diasDeViaje = diasDeViaje;
	}
	
	public double validarNumeroPasajeros() {
		if (totalViajantes <= 80) {
			return validarDatos();	
		}
		else {
			return -1;
		}
	}
	
	
	
	private double validarDatos(){
		double descuento;
		
		if (destino.equals("PARIS")) {
			double adicional = 500;
			costoTotal = precioBase + adicional;
			System.out.println(" Entro en " + this.destino + "precio es" + costoTotal);
		} else if (destino.equals("NEW YORK CITY")) {
			double adicional = 600;
			costoTotal = precioBase + adicional;
			System.out.println(" Entro en New York City, precio es" + costoTotal);
		}
		else {
			costoTotal=precioBase;
			System.out.println(" Entro en otros destinos, precio es" + costoTotal);
			System.out.println(" MIRAAAA " + this.destino + "precio es" + costoTotal);
		}
	
	    if (totalViajantes >= 4 && totalViajantes <= 10) {
			descuento = 0.10;
			costoTotal = costoTotal -( costoTotal * descuento);
			System.out.println("Viajeros entre 4 y 10.  Hay 10% de descuento " +  ", precio es" + costoTotal);
		}
 
		else if (totalViajantes > 10) {
			descuento = 0.20;
			costoTotal =costoTotal- (costoTotal * descuento);
			System.out.println(" Viajeros mayor a 10, hay 20% de descuento " +  ", precio es" + costoTotal);
		}
		else {
			descuento = 0.00;
			costoTotal =costoTotal+ (costoTotal * descuento);
			System.out.println(" No hay descuento " +  ", precio es" + costoTotal);
		}
	    
		if ((diasDeViaje <= 7 ) && (diasDeViaje!=2)) {
			costoTotal = costoTotal + 200;
			System.out.println("Total dias de estadía: No 2 días pero menor o igual a 7 días se suman  $200 "
					+ ", precio es" + costoTotal);
		} 
		else if (diasDeViaje >= 30) {
			costoTotal = costoTotal - 200;
			System.out.println(" O 2 días o mayor a 30 días se restan $200" + ", precio es" + costoTotal);
		} else {
				System.out.println(" Otros casos");
				costoTotal = costoTotal + 0;
		}
	    
		System.out.println("TOTAL A PAGAR POR EL VIAJE:");
		return costoTotal;
		}
	
}

