package Estimador;
import java.util.Scanner;
public class Main {
	/**Main*/
	//CHECKSTYLE: OFF
	public static void main(String[] args) {
	//"CHECKSTYLE: ON
		// TODO Auto-generated method stub
		System.out.println(" Vacation Calculator ");
		Vacaciones paquete = new Vacaciones();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your destiny of vacation:");
		String flag1;
		String destino = scanner.nextLine();
		paquete.setDestino(destino);
		flag1 =paquete.getDestino().toUpperCase();
		System.out.println("Type tourist number of te travel "
				+ "totalViajantes:");
		double flag2;
		int totalViajantes = scanner.nextInt();
		paquete.setTotalViajantes(totalViajantes);
		flag2 =paquete.getTotalViajantes();
		System.out.println("Type the number of the days of "
				+ "your travel diasDeViaje:");
		double flag3;
		int diasDeViaje = scanner.nextInt();
		flag3=paquete.getDiasDeViaje();
		System.out.println(paquete.validarNumeroPasajeros());
		/**Pruebas con rangos no habilitadas
		* Vacaciones test[] = new Vacaciones[3];
         
		* test[0] = new Vacaciones("Paris",4,7);
        * test[1] = new Vacaciones("New York City",10,5);
        * test[2] = new Vacaciones("London",12,10);
		
        * for(int i=0; i<3; i++) {
        * 	System.out.println(test[i].validarNumeroPasajeros());
        * }
        */
}
}
