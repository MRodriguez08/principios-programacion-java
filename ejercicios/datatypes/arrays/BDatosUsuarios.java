
import java.util.Scanner;

/**
* Programa: BDatos Usuarios
*
* El objetivo de este programa es ver el uso del tipo de datos
* Array (Primitivo)
*
* @author: Mauricio Rodriguez
*/
public class BDatosUsuarios {
	
	public static void main(String[] argumentos){
		
		Scanner input = new Scanner(System.in);
		
		int[] calificaciones = new int[]{12, 8, 9, 11}; 
		
		// definir bdatos de usuarios
		String[] listaUsuarios = new String[15];
		
		// solicitar al usuario ingreso de datos
		for(int indice = 0; indice < listaUsuarios.length; indice++){
			// asignar el valor ingresado al lugar correspondiente
			System.out.print("Ingrese el usuario " + indice + ": ");
			listaUsuarios[indice] = input.nextLine(); 
		}
		
		// imprimir los elementos de nuestra bdatos
		for(String usuarioActual : listaUsuarios){
			if (!usuarioActual.equals(""))
				System.out.println(usuarioActual);
		}
		
		input.close();
	}
	
}