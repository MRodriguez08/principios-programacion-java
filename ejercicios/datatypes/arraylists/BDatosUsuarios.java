
import java.util.Scanner;
import java.util.ArrayList;

/**
* Programa: BDatos Usuarios
*
* El objetivo de este programa es ver el uso del tipo de datos
* ArrayList
*
* @author: Mauricio Rodriguez
*/
public class BDatosUsuarios {
	
	public static void main(String[] argumentos){
		
		Scanner input = new Scanner(System.in);
		
		// creacion de la base de datos
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		
		System.out.println("largo inicial: " + listaUsuarios.size());
		
		// solicitar informacion al usuario
		String nombreUsuario = "";
		do {
			
			System.out.println("Ingrese un usuario (o 'S' para salir):");
			nombreUsuario = input.nextLine();
			if (!nombreUsuario.equalsIgnoreCase("s")){
				// agregar un elemento a un arrayList
				listaUsuarios.add(nombreUsuario);
			}
			
		} while (!nombreUsuario.equalsIgnoreCase("s"));
		
		// imprimir los datos de la base de datos
		
		System.out.println("Lista Usuarios");
		for (int indice = 0; indice < listaUsuarios.size(); indice++){
			
			// obtener el elemento n.esimo de un arrayList
			System.out.println(listaUsuarios.get(indice));
		}
		
		// eliminar un elemento de un arrayList
		listaUsuarios.remove("carlos");
		
		System.out.println("Lista post eliminado de Carlos");
		for (String usuarioActual : listaUsuarios){
			System.out.println(usuarioActual);
		}
		
		System.out.println("largo final: " + listaUsuarios.size());
		
		input.close();
	}
	
}