
import java.util.Scanner;
import java.util.ArrayList;

public class GestorUsuarios {
	
	// solicitar login
	// agregar un usuario
	// listar usuarios
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		
		imprimirCabezal();
		boolean loginOk = loginUsuario(input);
		
		if (loginOk){
			String opcion = "";
			do {
				imprimirCabezal();
				imprimirMenu();
				opcion = input.nextLine();
				
				switch(opcion){
					"1": {
						agregarNuevoUsuario(input, listaUsuarios);
						break;
					}
					"2" : {
						// implementar listado de usuarios
					}
				}
				
			} while (!opcion.equals("3"));
			
		} else {
			System.out.println("credenciales incorrectas");
		}
		
		input.close();
	}
	
	public static void agregarNuevoUsuario(
			Scanner in, ArrayList<String> lista){
		System.out.print("#### Ingreso de usuario ####");
		System.out.print("nombre:");
		String nombre = in.nextLine();
		
		System.out.print("apellido:");
		String nombre = in.nextLine();
		
		lista.add(nombre + "," + apellido);
	}
	
	public static boolean loginUsuario(Scanner in){
		System.out.print("usuario:");
		String usuario = in.nextLine();
		
		System.out.print("contrasenia:");
		String contrasenia = in.nextLine();
		boolean loginOk = usuario.equals("admin") 
			&& contrasenia.equals("admin");
		return loginOk;
	}
	
	public static void imprimirCabezal(){
		System.out.println("###########################");
		System.out.println("##### GESTOR USUARIOS #####");
		System.out.println("###########################");
	}
	
	public static void imprimirMenu(){
		System.out.println("1) Agregar usuario");
		System.out.println("2) Listar usuarios");
		System.out.println("3) Salir");
	}
	
}
