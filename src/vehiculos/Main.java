package vehiculos;

public class Main {

	public static void main(String[] args) {
		Avion F18 = new Avion();
		F18.setTipo("Avion");
		F18.setRuedas(4);
		F18.setEnMarcha(true);
		F18.setVolando(true);
		F18.mostrarInfo();
		
		Coche ferrari = new Coche();
		ferrari.setMarca("ferrari");
		ferrari.setEnMarcha(false);
		ferrari.setRuedas(4);
		ferrari.setTipo("Coche");
		ferrari.mostrarInfo();
		
		Vehiculo patata = new Vehiculo();
		patata.setTipo("patata");
		patata.setEnMarcha(false);
		patata.setRuedas(1);
		patata.mostrarInfo();
	}

}
