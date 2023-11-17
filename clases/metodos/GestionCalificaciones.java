
import java.util.Scanner;
import java.util.ArrayList;

public class GestionCalificaciones{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> alumnos = new ArrayList<String>();
		ArrayList<Integer[]> calificaciones = new ArrayList<Integer[]>();
		
		for (int alumno = 0; alumno < 5; alumno++){
			alumnos.add("alumno " + alumno);
			calificaciones.add(new Integer[15]);
		}
		
		
		String[][] bancos = new String[5][5];
		
		
		System.out.println("Menu");
		System.out.println("1) Ingresar calificacion");
		System.out.println("2) Calcular promedio");
		System.out.println("3) Imprimir Calificaciones");
		
		ingresarCalificacion(input, calificaciones);
		
		
		
		input.close();
	}
	
	/**
	* Precondicion: el alumno esta previamente ingresado
	*/
	public static boolean ingresarCalificacion(Scanner in, 
		ArrayList<Integer[]> listaCalif){
		
		System.out.println("indice alumno:");	
		int posicion = in.nextInt();
		in.nextLine();
		
		System.out.println("Calificacion:");	
		int nuevaCalif = in.nextInt();
		in.nextLine();
		
		Integer[] calificacionesAlumnoSeleccionado = listaCalif.get(posicion);
		
		for (int idx = 0; idx < calificacionesAlumnoSeleccionado.length, idx++){
			if (calificacionesAlumnoSeleccionado[idx] == null){
				calificacionesAlumnoSeleccionado[idx] = nuevaCalif;
			}
		}
		
	}
	
}