
import java.util.ArrayList;
import java.util.Scanner;

/**
* Programa: ListadoClientes
*
* El objetivo de este programa es utilizar ArrayLists
* y un algoritmo basico de entrada de datos.
*
* @author: Mauricio Rodriguez
*/
public class ListadoClientes {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	  
		ArrayList<String> listaDeClientes = new ArrayList<String>();
		
		listaDeClientes.add("Fernanda");
		
		String cliente = "";
		do {
			cliente = scanner.nextLine();
			if (!cliente.equals("s")){
				listaDeClientes.add(cliente);
			}
		} while (!cliente.equals("s"));
		
		
		System.out.println(scanner);
		System.out.println(listaDeClientes);
		
		scanner.close();
	
	}
  
}