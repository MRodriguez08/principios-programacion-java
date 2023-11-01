
import java.util.Scanner;
import java.util.ArrayList;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
* Programa: Leer Archivo
*
* El objetivo de este programa implementar el codigo necesario
* para la lectura de un archivo en JAVA.
*
* @author: Mauricio Rodriguez
*/
public class LeerArchivo {

	public static void main(String[] args){
		System.out.println("Leyendo archivo...");
		
		try {
			
			File file = new File("archivo_ejemplo.txt");
			Scanner scanner = new Scanner(file);
			
			System.out.println("############ Contenido del archivo leido ##########");
			while (scanner.hasNextLine()){
				String linea = scanner.nextLine();
				System.out.println(linea);
			}
			System.out.println("############ Contenido del archivo leido ##########");
			
			scanner.close();
		} catch(Exception e){
			e.printStackTrace();
		} 
		
		System.out.println("Leyendo archivo...hecho!");
	}
	
}