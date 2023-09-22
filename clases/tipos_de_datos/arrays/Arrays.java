
/**
* Programa: Arrays
*
* El objetivo de este programa es Crear e inicializar un array en Java
*
* @author: Mauricio Rodriguez
*/
public class Arrays {
	
	public static void main(String[] args){
		
		// Imprimimos el cabezal
		System.out.println("");
		System.out.println("######### Arrays #########");
		System.out.println("");
		
		/*
		* Declaracion de un array
		*/
		String[] listaProfesores;
		String listaContactos[];
		
		/*
		* Declaracion e instanciación de un array sin valores iniciales
		*
		* tipo[] nombreArray = new tipo[tamaño];
		* En este caso, los elementos no tienen valor inicial
		*/
		int[] calificaciones = new int[10];
		
		/*
		* Declaración de un array con valores iniciales 
		*/                                  /*  0        1       2       3        4           5   */
 		String[] listaAlumnos = new String[]{"Maria", "Pablo", "Ana", "José", "Josefina", "Horacio"};
		
		/*
		* Actualizacion de un elemento del array
		*/
		listaAlumnos[1] = "Pablo González";
		
		/*
		* Obtener el valor de un elemento del array
		*/
		String nombreEnLugar0 = listaAlumnos[0]; // María
		String nombreEnLugar3 = listaAlumnos[3]; // José
		
		/*
		* Obtener el largo de un array
		*/
		int largoArray = listaAlumnos.length;
		
		/*
		* Arrays de distintos tipos
		*/
		boolean[] usuariosHabilitados = new boolean[5];
		
		int[] edadAlumnos = new int[10];
		
		String[] palabrasDeCarta = new String[256];
		
		float[] listaEstaturas = new float[15];
		
	}
	
}