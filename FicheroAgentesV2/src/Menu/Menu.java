package Menu;

import java.util.Scanner;

public class Menu {
	
	public int mostrarMenu(){
		Scanner leer= new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("::::::::::::::::::::::::: MENU :::::::::::::::::::::::::");
		System.out.println(": 1- Ver todos los agentes con su informaci�n          :");
		System.out.println(": 2- Ver los agentes que ganen m�s de una cantidad X   :");
		System.out.println(": 3- Dar de alta un nuevo piso                         :");
		System.out.println(": 4- Dar de alta una nueva arma                        :");
		System.out.println(": 5- Dar de alta un nuevo agente                       :");
		System.out.println(": 6- Encriptar toda la informaci�n                     :");
		System.out.println(": 7- Desencriptar toda la informaci�n                  :");
		System.out.println(": 8- Salir                                             :");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		try {
			System.out.println("ELIJA UNA OPCI�N");
			opcion = leer.nextInt();
		} catch (Exception e) {
			System.err.println("OPCI�N DESCONOCIDA");
		}
		
		if (opcion<1 || opcion>8) {
			System.err.println("OPCI�N DESCONOCIDA");
		}
		
		
		
		
		return opcion;
	}
}
