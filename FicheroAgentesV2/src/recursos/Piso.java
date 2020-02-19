package recursos;

import java.util.Scanner;

public class Piso {

	private String poblacion;
	private String direccion;
	private int numero;
	
	
	public Piso(String poblacion, String direccion, int numero) {
		this.poblacion = poblacion;
		this.direccion = direccion;
		this.numero = numero;
	}

	public Piso() {
		// TODO Auto-generated constructor stub
	}

	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Piso[] nuevoPiso() {
		Scanner leer = new Scanner(System.in);
		Piso[] vPisos = new Piso[50];
		
		System.out.println("Localidad del piso:");
		poblacion = leer.nextLine();
		leer = new Scanner(System.in);
		System.out.println("Dirección del piso:");
		direccion = leer.nextLine();
		leer = new Scanner(System.in);
		System.out.println("Número del piso:");
		numero = leer.nextInt();
		
		Piso piso = new Piso(poblacion, direccion, numero);
		
		for (int i = 0; i < vPisos.length; i++) {
			if (vPisos[i]==null) {
				vPisos[i]=piso;
				break;
			}
		}
		
		return vPisos;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return poblacion + ", " + direccion + ", número " + numero;
	}
	
	
	
}
