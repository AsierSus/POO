
public class Alumno extends Persona{

	private int curso;
	private float nota;
	
	public Alumno(String nombre, String apellido, String telefono, String DNI, int curso, float nota) {
		super(nombre,apellido,DNI,telefono);
		this.curso = curso;
		this.nota = nota;
	}

	public int getCurso() {
		return curso;
	}

	public float getNota() {
		return nota;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public String mostrarPersona() {
		
		return "El nombre del alumno es " + nombre + " y su apellido es " + apellido + " con el DNI " + DNI + " el telefono " + telefono + " está en el curso " + curso + " y su nota es " + nota;
	}

}