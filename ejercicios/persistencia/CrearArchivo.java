
import java.util.Scanner;
import java.util.ArrayList;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
* Programa: Crear Archivo
*
* El objetivo de este programa implementar el codigo necesario
* para la creacion de un archivo en JAVA.
*
* @author: Mauricio Rodriguez
*/
public class CrearArchivo {
	
	public static void main(String[] args){
		
		try {
			
			File file = new File("archivo_ejemplo.txt");
			if (!file.exists()){
				boolean creado = file.createNewFile();
				if (creado) {
					System.out.println("archivo creado con exito");
				} else {
					System.out.println("error al crear archivo");
				}
			}
			
			System.out.println("escribiendo datos en archivo....");
			FileWriter writer = new FileWriter(file);
			writer.write("Bienvenidos al curso de JAVA!!");
			System.out.println("escribiendo datos en archivo....echo!");
			writer.close();
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}