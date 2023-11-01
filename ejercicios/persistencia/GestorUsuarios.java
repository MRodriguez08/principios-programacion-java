
import java.util.Scanner;
import java.util.ArrayList;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class GestorUsuarios {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> listaUsuarios = new ArrayList<String>();
		cargarDatos(listaUsuarios);
		
		imprimirCabezal();
		boolean loginOk = loginUsuario(input);
		
		if (loginOk){
			String opcion = "";
			do {
				imprimirCabezal();
				imprimirMenu();
				opcion = input.nextLine();
				
				switch(opcion){
					case "1" : {
						agregarNuevoUsuario(input, listaUsuarios);
						persistirDatos(listaUsuarios);
						break;
					}
					case "2" : {
						imprimirUsuarios(listaUsuarios);
						break;
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
		System.out.println("#### Ingreso de usuario ####");
		System.out.print("nombre:");
		String nombre = in.nextLine();
		
		System.out.print("apellido:");
		String apellido = in.nextLine();
		
		lista.add(nombre + "," + apellido);
	}
	
	public static boolean loginUsuario(Scanner in){
		System.out.println("usuario:");
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
	
	public static void imprimirUsuarios(ArrayList<String> lista){
		for (String itemUsuario : lista){
			System.out.println(itemUsuario);
		}
	}
	
	public static void cargarDatos(ArrayList<String> lista){
		System.out.println("Cargando base de datos...");
		try {
			Scanner scanner = new Scanner(new File("datos_usuarios.csv"));

			while (scanner.hasNextLine()) {
				String registroUsuario = scanner.nextLine();
				if (!registroUsuario.startsWith("nombre")){
					System.out.println("Cargando usuario: " + registroUsuario);
					lista.add(registroUsuario);
				}
			}

			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Cargando base de datos...finalizado!");
	}
	
	public static void persistirDatos(ArrayList<String> lista){
		try {
			File baseDatos = new File("datos_usuarios.csv");
			if (!baseDatos.exists()){
				if (baseDatos.createNewFile()) {
					System.out.println("base de datos creada: " + baseDatos.getName());
				} else {
					System.out.println("Error al crear base de datos");
				}
			}
			
			FileWriter myWriter = new FileWriter(baseDatos);
			myWriter.write("nombre,apellido\n");
			for (String itemUsuario : lista){
				myWriter.write(itemUsuario + "\n");
			}
			myWriter.close();
			System.out.println("Base de datos actualizada.");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}