package recursos;

import java.util.Scanner;

public class Arma {
	
	private String nombre;


	public Arma(String nombre) {
		this.nombre = nombre;
	}
	public Arma() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Arma[] nuevoArma() {
		Scanner leer = new Scanner(System.in);
		Arma[] vArmas = new Arma[50];
		
		System.out.println("Arma a registrar:");
		nombre = leer.nextLine();

		
		Arma arma = new Arma(nombre); 
		
		for (int i = 0; i < vArmas.length; i++) {
			if (vArmas[i]==null) {
				vArmas[i]=arma;
				break;
			}
		}
		
		return vArmas;
	}
	

	@Override
	public String toString() {
		return  nombre;
	}
	
	
	
}
