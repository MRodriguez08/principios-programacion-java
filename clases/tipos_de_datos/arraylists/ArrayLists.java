
import java.util.ArrayList;

/**
* Programa: ArrayLists
*
* El objetivo de este programa es Crear e inicializar ArrayLists.
*
* @author: Mauricio Rodriguez
*/
public class ArrayLists {
	
	public static void main(String[] args){
		
		// Imprimimos el cabezal
		System.out.println("");
		System.out.println("######### ArrayLists #########");
		System.out.println("");
		
		/*
		* ArrayList generico
		* 
		* ArrayList que puede contener elementos de distintos tipos de datos.
		*/
		ArrayList listaDeDatos = new ArrayList();
		listaDeDatos.add(1);
		listaDeDatos.add("Hola Mundo!!");
		listaDeDatos.add(2.4f);
		
		/*
		* Declaracion e inicializacion de un ArrayList con elementos
		*
		* ArrayList que contendrá solamente elementos de tipo Integer
		*/
		ArrayList<Integer> listaCalificaciones = new ArrayList<Integer>(){{
			add(8);
			add(12);
			add(6);
		}};
		
		/*
		* Declaracion e instanciación de un ArrayList vacío
		* y posterior ingreso de elementos
		* 
		* ArrayList que contendrá solamente elementos de tipo String
		*/
		ArrayList<String> listaAlumnos = new ArrayList<String>();
		listaAlumnos.add("Agustina");
		listaAlumnos.add("Juan");
		listaAlumnos.add("Fernando");
		
		/*
		* Agregar un nuevo elemento al ArrayList
		*/
		listaAlumnos.add("Emilia"); // Fernando
		
		/*
		* Obtener un elemento del ArrayList en una posicion dada
		*/
		String alumno = listaAlumnos.get(2); // Fernando
		
		/*
		* Eliminar un elemento del ArrayList en una posicion dada
		*/
		listaAlumnos.remove(3); // Emilia es eliminada de la lista
		
		/*
		* Obtener el lardo del ArrayList
		*/
		int cantidadAlumnos = listaAlumnos.size(); // 3
		
		/*
		* Borrar todos los elementos del ArrayList
		*/
		listaAlumnos.clear(); // 3
		
	}
	
}