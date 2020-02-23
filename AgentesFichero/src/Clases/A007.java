package Clases;
public final class A007 extends Agente{

	private int muertesConfirmadas;
	private int armasDisponibles;
	
	
	public A007(String nombre, int edad, String direccion, double salario,
			int muertesConfirmadas, int armasDisponibles) {
		super(nombre, edad, direccion, salario);
		this.muertesConfirmadas = muertesConfirmadas;
		this.armasDisponibles = armasDisponibles;
	}


	public int getMuertesConfirmadas() {
		return muertesConfirmadas;
	}


	public void setMuertesConfirmadas(int muertesConfirmadas) {
		this.muertesConfirmadas = muertesConfirmadas;
	}


	public int getArmasDisponibles() {
		return armasDisponibles;
	}


	public void setArmasDisponibles(int armasDisponibles) {
		this.armasDisponibles = armasDisponibles;
	}


	public String toString() {
		return "+007+" + super.toString() + "ABATIDOS: " + muertesConfirmadas + "\n"
				+ "INVENTARIO: " + armasDisponibles;
	}
	
	

	
	
	
	
	
	
}
