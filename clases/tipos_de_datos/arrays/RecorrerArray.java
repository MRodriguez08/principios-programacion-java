
/**
* Programa: Recorrer Arrays
*
* El objetivo de este programa es implementar el recorrido de los elementos de un
* array utilizando las distintas opciones iterativas
*
* @author: Mauricio Rodriguez
*/
public class RecorrerArray {
	
	public static void main(String[] args){
		
		// Imprimimos el cabezal
		System.out.println("");
		System.out.println("######### Recorrer Arrays #########");
		System.out.println("");
		
		/*
		* Declaración de un array con valores iniciales 
		*/                                  /*  0        1       2       3        4           5   */
 		String[] listaAlumnos = new String[]{"Maria", "Pablo", "Ana", "Jose", "Josefina", "Horacio"};
		
		/*
		* Usando For
		*/
		System.out.println("Recorremos utilizando FOR");
		for(int indice = 0; indice < listaAlumnos.length; indice++){
			System.out.println("Elemento " + indice + ": " + listaAlumnos[indice]);
		}
		
		/*
		* Usando ForEach
		*/
		System.out.println("Recorremos utilizando FOREACH");
		for(String nombre : listaAlumnos){
			System.out.println("Elemento: " + nombre);
		}
		
		/*
		* Usando While
		*/
		System.out.println("Recorremos utilizando WHILE");
		int indice = 0;
		while(indice < listaAlumnos.length){
			System.out.println("Elemento " + indice + ": " + listaAlumnos[indice]);
			indice++;
		}
		
		/*
		* Usando Do...While
		*/
		System.out.println("Recorremos utilizando DO...WHILE");
		int indiceDoWhile = 0;
		do{
			System.out.println("Elemento " + indiceDoWhile + ": " + listaAlumnos[indiceDoWhile]);
			indiceDoWhile++;
		} while(indiceDoWhile < listaAlumnos.length);
		
	}
	
}