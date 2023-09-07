import java.util.Scanner;

public class UsoScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese su nombre:");
		String nombre = input.nextLine();
		
		System.out.println("Ingrese su edad:");
		int edad = input.nextInt();// 32 + enter
		input.nextLine();
		
		System.out.println("Ingrese su fecha de nacimiento:");
		String fecha = input.nextLine(); // enter
		
		System.out.println("nombre:" + nombre);
		System.out.println("edad:" + edad);
		System.out.println("fecha:" + fecha);
		
		String opcion = "";
		while(!opcion.equals("salir")){
			opcion = input.nextLine();
		}
		
		input.close();
	}

}