
import java.util.ArrayList;

/**
* Programa: Recorrer ArraysLists
*
* El objetivo de este programa es implementar el recorrido de los elementos de un
* arraylist utilizando las distintas opciones iterativas
*
* @author: Mauricio Rodriguez
*/
public class RecorrerArray {
	
	public static void main(String[] args){
		
		// Imprimimos el cabezal
		System.out.println("");
		System.out.println("######### Recorrer ArrayLists #########");
		System.out.println("");
		
		ArrayList<String> listaAlumnos = new ArrayList<String>();
		listaAlumnos.add("Agustina");
		listaAlumnos.add("Juan");
		listaAlumnos.add("Fernando");
		
		/*
		* Usando For
		*/
		System.out.println("Recorremos utilizando FOR");
		for(int indice = 0; indice < listaAlumnos.size(); indice++){
			System.out.println("Elemento " + indice + ": " + listaAlumnos.get(indice));
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
		while(indice < listaAlumnos.size()){
			System.out.println("Elemento " + indice + ": " + listaAlumnos.get(indice));
			indice++;
		}
		
		/*
		* Usando Do...While
		*/
		System.out.println("Recorremos utilizando DO...WHILE");
		int indiceDoWhile = 0;
		do {
			System.out.println("Elemento " + indiceDoWhile + ": " + listaAlumnos.get(indiceDoWhile));
			indiceDoWhile++;
		} while(indiceDoWhile < listaAlumnos.size());
		
	}
	
}