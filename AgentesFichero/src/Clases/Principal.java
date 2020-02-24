package Clases;

import java.util.Scanner;

import Datos.ioDatos;
import Menu.Menu;
import recursos.Arma;
import recursos.Piso;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		double salario = 0;
		
		Piso[] vPisos = new Piso[50];
		Arma[] vArmas = new Arma[50];
		Agente[] vAgentes = new Agente[50];
		Agente[] vAgenteBusqueda = new Agente[50];
		
		ioDatos datos = new ioDatos();
		//Menu menu = new Menu();
		Piso piso = new Piso();
		Arma arma = new Arma();
		
		
		do {
			opc = Menu.mostrarMenu();
			switch (opc) {

			case 1://Ver todos los agentes con su información

				vAgenteBusqueda = datos.desencriptarDatosAgentes();
				
				for (Agente agente : vAgenteBusqueda) {
					if (agente!=null) {
						agente.toString();
						
					}
				}
				
				break;
			case 2://Ver los agentes que ganen más de una cantidad X

				System.out.println("BUSCAR POR SALARIO MAYOR A:");
				salario = leer.nextDouble();
				
				
				for (Agente agente : vAgenteBusqueda) {
					if (agente!=null) {
						if (agente.getSalario()>salario) {
							agente.toString();
						}
					}
				}
				
				break;
			case 3://DAR DE ALTA UN NUEVO PISO
				piso.nuevoPiso();
				break;
			case 4://DAR DE ALTA UN NUEVO ARMA
				arma.nuevoArma();
				break;
			case 5://DAR DE ALTA UN NUEVO AGENTE
				nuevoAgente();
				break;
			case 6://ENCRIPTAR DATOS
				datos.encriptarDatosPisos(vPisos);
				datos.encriptarDatosArma(vArmas);
				datos.encriptarDatosAgentes(vAgentes);
				break;
			case 7://DESENCRIPTAR DATOS
				datos.desencriptarDatosPiso();
				datos.desencriptarDatosAgentes();
				datos.desencriptarDatosArma();
				break;
			case 8://SALIR
				System.out.println("Apagando aplicación");
				break;
			}
		} while (opc != 8);

	}
	
	
	public static Agente[] nuevoAgente() {
		Scanner leer = new Scanner(System.in);
		int tipoAgente = 0;
		int edad = 0;
		int muertes = 0;
		int numeroArmas = 0;
		int aniosMandato = 0;
		String nombre = "";		
		String direccion = "";		
		double salario = 0;
		boolean agenteAñadido = false;
		
		Agente[] vAgentes = new Agente[50];
				
		try {
			System.out.println("Tipo agente a dar de alta: 007 (1) - Espia (2) - Jefazo (3)");
			tipoAgente = leer.nextInt();
		} catch (Exception e) {
			System.err.println("FALLO");
		}
		
		if ((tipoAgente!=1)&&(tipoAgente!=2)&&(tipoAgente!=3)) {
			System.err.println("NIVEL NO DISPONIBLE");
		}
		
		try {
			leer = new Scanner(System.in);
			System.out.println("Nombre agente");
			nombre = leer.nextLine();
			leer = new Scanner(System.in);
			System.out.println("Edad agente");
			edad = leer.nextInt();
			leer = new Scanner(System.in);
			System.out.println("Dirección agente");
			direccion = leer.nextLine();
			leer = new Scanner(System.in);
			System.out.println("Salario agente");
			salario = leer.nextDouble();
			
			if (tipoAgente==1) {
				leer = new Scanner(System.in);
				System.out.println("Muertes confirmadas");
				muertes= leer.nextInt();
				leer = new Scanner(System.in);
				System.out.println("Número armas disponibles");
				numeroArmas = leer.nextInt();
				
				A007 agen = new A007(nombre, edad, direccion, salario, muertes, numeroArmas);
				for (int i = 0; i < vAgentes.length; i++) {
					if (vAgentes[i]==null) {
						vAgentes[i]= agen;
						break;
					}
				}
			}
			
			/*if (tipoAgente==2) {
				vPisos = obtenerPisos();
				Espia espia = new Espia(nombre, edad, direccion, salario, vPisos);
				
				
				for (int i = 0; i < vAgentes.length; i++) {
					if (vAgentes[i]==null) {
						vAgentes[i]= espia;
						break;
					}
				}
				
			}*/
			
			if (tipoAgente==3) {
				leer = new Scanner(System.in);
				System.out.println("Años mandato");
				aniosMandato = leer.nextInt();
				
				Jefazo jefe = new Jefazo(nombre, edad, direccion, salario, aniosMandato);
				
				for (int i = 0; i < vAgentes.length; i++) {
					if (vAgentes[i]==null) {
						vAgentes[i]= jefe;
						break;
					}
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return vAgentes;

	}

}
