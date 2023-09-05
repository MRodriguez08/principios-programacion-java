
/**
* Programa: Buscar Usuario
*
* El objetivo de este programa es utilizar la estructura
* de control iterativa "While" en un ejemplo práctico.
*
* @author: Mauricio Rodriguez
*/
public class BuscarUsuario {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Buscador de usuario  #########");
		System.out.println("");
		
		String usuarioBuscado = "Pedro";
		String[] listaUsuarios = new String[]{"Maria", "Juan", "Pedro", "Ana"};
		
		boolean usuarioEncontrado = false;
		int indice = 0;
		while(!usuarioEncontrado){
			if (usuarioBuscado.equals(listaUsuarios[indice])){
				usuarioEncontrado = true;
			}
			indice++;
		}
		System.out.println("Usuario '"+usuarioBuscado+"' encontrado: " + usuarioEncontrado);
	}
	

}