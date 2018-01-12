import java.util.Scanner;

import persona.Coche;

public class Main {

	public static void main(String[] args) {
		
		Coche coche = new Coche();
		
		coche.setLitrosCombustible(0);
		coche.setCapacidadCombustible(50);
		coche.setEsGasolina(true);
		
		System.out.println("El coche tiene " + coche.getLitrosCombustible() + " litros");
		
		double devolucion = coche.repostar(100);
		
		System.out.println("El coche tiene " + coche.getLitrosCombustible() + " litros y la devolucion es " + devolucion);
	}
}
