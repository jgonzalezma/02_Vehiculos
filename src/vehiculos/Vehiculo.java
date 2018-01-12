package vehiculos;

public class Vehiculo {
	private String tipo;
	private int ruedas;
	private boolean enMarcha;
	
	public Vehiculo(String tipo, int ruedas, boolean enMarcha){	
	}
	
	public Vehiculo(){
	}
	
	public void mostrarInfo(){
		System.out.print("\nEl vehiculo es un " + this.getTipo());
		System.out.print(", tiene " + this.getRuedas() + " ruedas");
		if(enMarcha){
			System.out.println(" y esta en marcha");
		}else{
			System.out.println(" y no esta en marcha");
		}
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public boolean isEnMarcha() {
		return enMarcha;
	}
	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	
}
