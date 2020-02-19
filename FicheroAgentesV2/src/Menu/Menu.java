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
		System.out.println(": 1- Ver todos los agentes con su información          :");
		System.out.println(": 2- Ver los agentes que ganen más de una cantidad X   :");
		System.out.println(": 3- Dar de alta un nuevo piso                         :");
		System.out.println(": 4- Dar de alta una nueva arma                        :");
		System.out.println(": 5- Dar de alta un nuevo agente                       :");
		System.out.println(": 6- Encriptar toda la información                     :");
		System.out.println(": 7- Desencriptar toda la información                  :");
		System.out.println(": 8- Salir                                             :");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		try {
			System.out.println("ELIJA UNA OPCIÓN");
			opcion = leer.nextInt();
		} catch (Exception e) {
			System.err.println("OPCIÓN DESCONOCIDA");
		}
		
		if (opcion<1 || opcion>8) {
			System.err.println("OPCIÓN DESCONOCIDA");
		}
		
		
		
		
		return opcion;
	}
}
