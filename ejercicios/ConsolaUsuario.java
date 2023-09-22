import java.util.Scanner;

public class ConsolaUsuario {

	
	public static void main(String[] args){
	
		// imprimir el banner y menu de usuario
		// -> IMPRIMIR BANNER x
		// -> IMPRIMIR MENU X
		System.out.println("###############################");
		System.out.println("##### DIVIDE Y VENCE! #########");
		System.out.println("###############################");
		
		System.out.println("Menu:");
		System.out.println("1) Ver datos de usuario");
		System.out.println("2) Modificar perfil");
		System.out.println("3) Validar contraseña");
		
		// Pida al usuario ingresar una opción
		Scanner input = new Scanner(System.in);
		String opcion = input.nextLine();
		
		System.out.println("opcion: " + opcion);
		
		// Implementar validar contraseña
		if (opcion.equals("1")){
			// implementar ver datos
		} else if (opcion.equals("2")){
			// implementare modificar
		} if (opcion.equals("3")){
			// implementar validar contraseña
			
			
			
			
			
			
			
		}
		
		
	
	}


}