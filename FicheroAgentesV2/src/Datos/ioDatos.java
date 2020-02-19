package Datos;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import recursos.Piso;

public class ioDatos {

	public void encriptarDatosPisos(Piso[] vPisos) {
		File pisos = new File("datos/pisos.dat");

		FileOutputStream fo = null;
		ObjectOutputStream escribir = null;
		if (!pisos.exists()) {
			try {
				pisos.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fo = new FileOutputStream(pisos);
			escribir = new ObjectOutputStream(fo);

			for (Piso piso : vPisos) {
				if (piso != null) {
					escribir.writeObject(piso);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void desencriptarDatosPiso() {
		File pisos = new File("datos/pisos.dat");
		FileInputStream fi;
		ObjectInputStream leer;
		Piso[] vPisos = new Piso[50];

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
				leer = new ObjectInputStream(fi);

				while (true) {
					for (int i = 0; i < vPisos.length; i++) {
						leer.readObject();
					}

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
