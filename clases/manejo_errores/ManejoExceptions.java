
import java.util.Scanner;

public class ManejoExceptions {
	
	public static void main(String[] args){
		
		System.out.println("Abriendo scanner...");
		Scanner in = new Scanner(System.in);
		
		try {
			int opcion = leerOpcion(in);
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("Ha ingresado un numero invalido");
		} finally{
			System.out.println("Cerrando scanner...");
			in.close();
		}
	}
	
	public static int leerOpcion(Scanner in) throws Exception {
		int opcion = in.nextInt();
		return opcion;
	}
	
}