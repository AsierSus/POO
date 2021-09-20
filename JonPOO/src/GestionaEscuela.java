import java.util.*;
public class GestionaEscuela {

	public static void main(String[] args) {

		ArrayList<Alumno>Alumnos=new ArrayList<>();
		ArrayList<Profesor>Profes=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n=0;

		do {
			do {
				System.out.println("Para dar de alta un alumno, pulsa 1:");
				System.out.println("Para dar de alta un profesor, pulsa 2:");
				System.out.println("Para ver la información de los alumnos, pulsa 3:");
				System.out.println("Para ver la información de los profesores, pulsa 4:");
				System.out.println("Para ver el porcentaje de alumnos aprobados, pulsa 5:");
				System.out.println("Para ver el profesor con más asignaturas y que sea tutor, pulsa 6:");
				System.out.println("Para salir, pulsa 7:");

				n=sc.nextInt();

				if(n!=1&n!=2&n!=3&n!=4&n!=5&n!=6&n!=7) {
					System.out.println("Introduce un número entre el 1 y el 7, por favor.");
				}
			}while(n!=1&n!=2&n!=3&n!=4&n!=5&n!=6&n!=7);

			switch(n) {
			case 1: Alumnos.add(crearAlumno(sc));
			break;
			case 2: Profes.add(crearProfesor(sc));
			break;
			case 3:
				for (int i=0;i<Alumnos.size();i++) {
					System.out.println(Alumnos.get(i).mostrarPersona());
				}
				break;
			case 4:
				for (int i=0;i<Profes.size();i++) {
					System.out.println(Profes.get(i).mostrarPersona());
				}
				break;
			case 5: porcentaje(Alumnos);
			break;
			case 6: masasig(Profes);
			break;
			case 7: System.out.println("Fin de programa.");
			break;
			}
		}while(n!=7);

		sc.close();
	}

	public static Alumno crearAlumno(Scanner sc) {

		int c;
		String n,a,t,d;
		float nota;
		System.out.println("Introduce el nombre del alumno:");
		n=sc.next();
		System.out.println("Introduce el apellido del alumno:");
		a=sc.next();
		System.out.println("Introduce el teléfono del alumno:");
		t=sc.next();
		System.out.println("Introduce el DNI del alumno:");
		d=sc.next();
		System.out.println("Introduce el curso del alumno:");
		c=sc.nextInt();
		System.out.println("Introduce la nota del alumno:");
		nota=sc.nextFloat();

		Alumno alumnos = new Alumno (n, a, t, d, c, nota);

		return alumnos;
	}
	
	public static Profesor crearProfesor(Scanner sc) {

		boolean esTutor;
		String n,a,t,d;
		int asig;
		System.out.println("Introduce el nombre del profesor:");
		n=sc.next();
		System.out.println("Introduce el apellido del profesor:");
		a=sc.next();
		System.out.println("Introduce el teléfono del profesor:");
		t=sc.next();
		System.out.println("Introduce el DNI del profesor:");
		d=sc.next();
		System.out.println("Introduce si el profesor es el tutor o no:");
		esTutor=sc.nextBoolean();
		System.out.println("Introduce el número de asignaturas que imparte el profesor:");
		asig=sc.nextInt();

		Profesor Profes = new Profesor (n, a, t, d, asig, esTutor);

		return Profes;
	}

	public static void porcentaje(ArrayList<Alumno> alumnos) {

		int cont=0;
		double por;
		for (int i=0; i<alumnos.size();i++) {
			if(alumnos.get(i).getNota()>=5) {
				cont= cont+1;
			}
		}
		por=(double)100*(double)cont/(double)alumnos.size();
		System.out.println("El porcentaje de alumnos aprobados es: " + por + "%");
	}

	public static void masasig(ArrayList<Profesor> profes) {

		int asig=0;
		for(int i=0;i<profes.size();i++) {
			if(profes.get(i).isEsTutor()&&profes.get(i).getAsig()>asig) {
				asig=profes.get(i).getAsig();
			}
			if(profes.get(i).getAsig()==asig) {
				System.out.println("El profesor tutor con más asignaturas es " + profes.get(i).getNom() + " y imparte " + asig + " asignaturas");
			}
		}
	}	
}