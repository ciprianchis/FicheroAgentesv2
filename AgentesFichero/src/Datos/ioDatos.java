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

import Clases.Agente;
import recursos.Arma;
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
		} finally {
			try {
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void desencriptarDatosPiso() {
		File pisos = new File("datos/pisos.dat");
		FileInputStream fi;
		ObjectInputStream leer = null;
		Piso[] vPisos = new Piso[50];

		if (!pisos.exists()) {
			try {
				pisos.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fi = new FileInputStream(pisos);
			leer = new ObjectInputStream(fi);

			while (true) {
				for (int i = 0; i < vPisos.length; i++) {
					leer.readObject();
					break;
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
		} finally {
			try {
				leer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void encriptarDatosAgentes(Agente[] vAgentes) {
		File agentes = new File("datos/agentes.dat");

		FileOutputStream fo = null;
		ObjectOutputStream escribir = null;
		if (!agentes.exists()) {
			try {
				agentes.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fo = new FileOutputStream(agentes);
			escribir = new ObjectOutputStream(fo);
			
			for (Agente agente : vAgentes) {
				if (agente!=null) {
					escribir.writeObject(agente);
				}	
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


	public void encriptarDatosArma(Arma[] vArmas) {
		File armas = new File("datos/armas.dat");

		FileOutputStream fo = null;
		ObjectOutputStream escribir = null;
		if (!armas.exists()) {
			try {
				armas.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fo = new FileOutputStream(armas);
			escribir = new ObjectOutputStream(fo);
			
			for (Arma arma: vArmas) {
				if (arma!=null) {
					escribir.writeObject(arma);
				}	
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	public void desencriptarDatosAgentes() {
		File agentes = new File("datos/agentes.dat");
		FileInputStream fi;
		ObjectInputStream leer = null;
		Agente[] vAgentes = new Agente[50];

		if (!agentes.exists()) {
			try {
				agentes.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fi = new FileInputStream(agentes);
			leer = new ObjectInputStream(fi);

			while (true) {
				for (int i = 0; i < vAgentes.length; i++) {
					leer.readObject();
					break;
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
		} finally {
			try {
				leer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	

	
	
	
	public void desencriptarDatosArma() {
		File armas = new File("datos/arma.dat");
		FileInputStream fi;
		ObjectInputStream leer = null;
		Arma[] vArma = new Arma[50];

		if (!armas.exists()) {
			try {
				armas.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fi = new FileInputStream(armas);
			leer = new ObjectInputStream(fi);

			while (true) {
				for (int i = 0; i < vArma.length; i++) {
					leer.readObject();
					break;
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
		} finally {
			try {
				leer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
