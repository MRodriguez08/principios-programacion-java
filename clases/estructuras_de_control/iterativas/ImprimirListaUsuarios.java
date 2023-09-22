
/**
* Programa: Imprimir Lista Usuarios
*
* El objetivo de este programa es utilizar la estructura
* de control iterativa "For" en un ejemplo práctico.
*
* @author: Mauricio Rodriguez
*/
public class ImprimirListaUsuarios {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Listado de usuarios  #########");
		System.out.println("");
		
		String[] listaUsuarios = new String[]{"Maria", "Juan", "Pedro", "Ana"};
		
		System.out.println("Comenzando ejecucion del for...");
		for (int indice = 0; indice < listaUsuarios.length; indice++){
			System.out.println(listaUsuarios[indice]);
		}
		System.out.println("Finalizando ejecucion del for...");
	}
	

}