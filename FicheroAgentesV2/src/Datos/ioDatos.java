package Datos;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ioDatos {

	
	public static void encriptarDatos(){
		File pisos = new File("datos/pisos.txt");
		
		if (!pisos.exists()) {
			try {
				pisos.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	public static void desencriptarDatos(){
		File pisos = new File("datos/pisos.txt");
		FileInputStream fi;
		DataInputStream leer;
		
		
		if (!pisos.exists()) {
			try {
				pisos.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while (true) {

			try {
				fi = new FileInputStream(pisos);
				leer = new DataInputStream(fi);
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	
	
}
