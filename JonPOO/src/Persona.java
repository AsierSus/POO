import java.util.*;

public abstract class Persona {

	protected String nombre, apellido, telefono, DNI;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String telefono, String DNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.DNI = DNI;
	}
	
	public abstract String mostrarPersona();

	public String getNom() {
		return nombre;
	}

	public String getApe() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDni() {
		return DNI;
	}

	public void setNom(String nom) {
		this.nombre = nombre;
	}

	public void setApe(String ape) {
		this.apellido = apellido;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDni(String dni) {
		this.DNI = DNI;
	}
	
}