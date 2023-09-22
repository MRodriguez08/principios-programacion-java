import java.util.Scanner;

public class Rockola {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String usuario = "";
		String contrasenia = "";
		int intento = 5;
		boolean loginOk = false;
		String mensajeError = "";
		
		do {

			limpiarPantalla();
			
			System.out.println("");
			System.out.println("######### Login de Usuario #########");
			System.out.println("");
			
			if (!mensajeError.equals("")) {
				System.out.println("");
				System.out.println("[[ " + mensajeError + " ]]");
				System.out.println("");
			}
			
			System.out.println("Usuario:");
			usuario = input.nextLine();
			
			System.out.println("Contrasenia:");
			contrasenia = input.nextLine();
			
			loginOk = usuario.equals("admin") && contrasenia.equals("admin");
			if(!loginOk){
				mensajeError = "Usuario y/o contrasenia invalidos. Le quedan " + intento + " intentos.";
			} else {
				mensajeError = "";
			}
			
			intento--;
		} while (!loginOk && intento > 0);
		
		if (!loginOk){
			limpiarPantalla();
			System.out.println("Usted ha sido bloqueado del sistema...");
		} else {
			int opcion = 0;
			
			do {
				
				limpiarPantalla();
				
				System.out.println("");
				System.out.println("######### Rockola #########");
				System.out.println("");
				
				if (!mensajeError.equals("")){
					System.out.println("");
					System.out.println("[[ " + mensajeError + " ]]");
					System.out.println("");
				}

				System.out.println("Menu:");
				System.out.println("1) Listar Discos");
				System.out.println("2) Ingresar Nuevo Disco");
				System.out.println("2) Ver Info de Disco");
				System.out.println("3) Eliminar Disco");
				System.out.println("4) Salir");
				
				opcion = input.nextInt();
				input.nextLine();
				
				switch(opcion){
					case 1: {
						limpiarPantalla();
						System.out.println("");
						System.out.println("######### Listado de Libros #########");
						System.out.println("");
						
						System.out.println("Enter para retornar a pantalla principal...");
						input.nextLine();
						break;
					}
					case 2: {
						limpiarPantalla();
						System.out.println("");
						System.out.println("######### Ingresar Nuevo Libro #########");
						System.out.println("");
						
						mensajeError = "";
						System.out.println("Enter para retornar a pantalla principal...");
						input.nextLine();
						break;
					}
					case 3: {
						limpiarPantalla();
						System.out.println("");
						System.out.println("######### Eliminar Libro #########");
						System.out.println("");
						
						mensajeError = "";
						System.out.println("Enter para retornar a pantalla principal...");
						input.nextLine();
						break;
					}
					case 4: {
						limpiarPantalla();
						System.out.println("");
						System.out.println("######### Salir del sistema #########");
						System.out.println("");
						
						System.out.println("¿Realmente desea salir del sistema? (S: si, N: no)");
						String confirmacion = input.nextLine();
						if (!confirmacion.equals("s") && !confirmacion.equals("S")){
							opcion = 0;
						}
						break;
					}
					default: {
						mensajeError = "Opcion invalida.";
						break;
					}
				}
				
			} while(opcion != 4);
			limpiarPantalla();
		}
		
		input.close();
	}
	
	public static final void limpiarPantalla(){
		// limpiar pantalla
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(Exception e){
			e.printStackTrace();
		}
		// limpiar pantalla
	}

}