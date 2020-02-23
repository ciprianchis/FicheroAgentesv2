package Clases;

public final class Jefazo extends Agente{

	private int aniosMandato;

	public Jefazo(String nombre, int edad, String direccion, double salario,
			int aniosMandato) {
		super(nombre, edad, direccion, salario);
		this.aniosMandato = aniosMandato;
	}

	public int getAniosMandato() {
		return aniosMandato;
	}

	public void setAniosMandato(int aniosMandato) {
		this.aniosMandato = aniosMandato;
	}

	public String toString() {
		return "*****************************" + "\n" 
				+ super.toString() + "\n" + "AÑOS DE MANDATO: " + aniosMandato +
				"\n" + "*****************************";
	}
	
	
	
	
	
	
	
	
	
	
}
