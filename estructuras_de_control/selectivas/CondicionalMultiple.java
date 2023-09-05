
/**
* Programa: Condicional Multiple
*
* El objetivo de este programa es utilizar la estructura
* de control selectiva Condicional Multiple (if..else if...else)
*
* @author: Mauricio Rodriguez
*/
public class CondicionalMultiple {

	public static void main(String[] args){
		
		String usuario = "usuario";
		
		if (usuario.equals("admin")){
			System.out.println("El usuario es administrador!");
		} else if (usuario.equals("supervisor")){
			System.out.println("El usuario es supervisor!");
		} else {
			System.out.println("Acceso restringido.");
		}
	
	}
	

}