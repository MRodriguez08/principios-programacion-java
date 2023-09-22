import java.util.Scanner;

public class ValidacionContrasenia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese contrasenia:");
		String contrasenia = input.nextLine();
		
		System.out.println("Contrasenia ingresada: " + contrasenia);
		
		// validacion del largo
		if (contrasenia.length() < 8 ){
			System.out.println("Contrasenia es corta");
		}
		
		// contiene CursoJava
		boolean contieneCursoJava = contrasenia.contains("CursoJava");
		if (contieneCursoJava == true){
			System.out.println("Contrasenia es segura");
			
			System.out.println("Ingrese confirmacion:");
			String confirmacion = input.nextLine();
			
			if ("pepe".equals("juan") == true){
				System.out.println("Confirmacion correcta");
			} else {
				System.out.println("Confirmacion incorrecta");
			}
			
		} else {
			System.out.println("Contrasenia NO es segura");
		}
	
		input.close();
	}

}