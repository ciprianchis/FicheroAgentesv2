import java.util.Arrays;


public final class Espia extends Agente{
	private String[] vPisos;

	public Espia(String nombre, int edad, String direccion, double salario,
			String[] vPisos) {
		super(nombre, edad, direccion, salario);
		this.vPisos = vPisos;
	}

	public String[] getvPisos() {
		return vPisos;
	}

	public void setvPisos(String[] vPisos) {
		this.vPisos = vPisos;
	}

	public String toString() {
		return "ESPIA" + "\n" + "Pisos: "
				+ (vPisos != null ? Arrays.asList(vPisos) : null) + "]";
	}

	

	
	
	
}
