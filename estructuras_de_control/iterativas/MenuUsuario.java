import java.util.Scanner;

/**
* Programa: Menu Usuario
*
* El objetivo de este programa es utilizar la estructura
* de control iterativa "While".
*
* @author: Mauricio Rodriguez
*/
public class MenuUsuario {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Menu de Usuario  #########");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		String opcionSeleccionada = "";
		do {
			System.out.println("Menu de usuario");
			System.out.println("1) Listar usuarios");
			System.out.println("2) Crear un usuario");
			System.out.println("3) Salir del sistema");
			
			opcionSeleccionada = input.nextLine();
		} while(!opcionSeleccionada.equals("3"));
	
		System.out.println("Saliendo del sistema...");
		input.close();
	}
	

}