import persona.Coche;

public class Coche_Constructor {

	public static void main(String[] args) {
		Coche coche = new Coche("renault", "azul", "12345");
		
		System.out.println(coche.getMarca() + " " + coche.getColor() + " " + coche.getMatricula());

	}

}
