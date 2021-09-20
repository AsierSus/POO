
public class Profesor extends Persona{

	private int asig;
	private boolean esTutor;
	
		public Profesor (String nombre, String apellido, String telefono, String DNI, int asig, boolean esTutor) {
			super(nombre,apellido,telefono,DNI);
			this.asig = asig;
			this.esTutor = esTutor;
		}

		public int getAsig() {
			return asig;
		}

		public boolean isEsTutor() {
			return esTutor;
		}

		public void setAsig(int asig) {
			this.asig = asig;
		}

		public void setEsTutor(boolean esTutor) {
			this.esTutor = esTutor;
		}
		
		public String mostrarPersona() {
			
			return "El nombre del profesor es " + nombre + " su apellido es " + apellido + " con el DNI " + DNI + " el telefono " + telefono + " con " + asig + " asignaturas y es tutor ";
		}
		
}