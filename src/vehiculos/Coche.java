package vehiculos;

public class Coche extends Vehiculo {
	private String marca;
	
	public Coche(String marca){
		
	}
	
	public Coche(){
		
	}
	
	public Coche(String tipo, int ruedas, boolean enMarcha, String marca){
		super("Coche", 4, false);
		this.marca = marca;
	}
	
	public void mostrarInfo(){
		super.mostrarInfo();
		System.out.println("La marca del coche es " + getMarca());
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
