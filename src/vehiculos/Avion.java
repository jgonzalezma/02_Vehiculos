package vehiculos;

public class Avion extends Vehiculo {
	private boolean volando;
	private int alas;
	
	public Avion(){
		
	}
	
	public Avion(int ruedas){
		super("avion", ruedas, false);
		this.volando = false;
		this.alas = 2;
	}
	public void mostrarInfo(){
		super.mostrarInfo();
		if(volando){
			System.out.println("El avion esta volando");
		}else{
			System.out.println("El vehiculo no esta volando");
		}
	}

	public boolean isVolando() {
		return volando;
	}

	public void setVolando(boolean volando) {
		this.volando = volando;
	}

	public String getAlas() {
		return alas;
	}

	public void setAlas(String alas) {
		this.alas = alas;
	}
	
}
