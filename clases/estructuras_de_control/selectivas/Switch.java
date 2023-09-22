
/**
* Programa: Switch
*
* El objetivo de este programa es utilizar la estructura
* de control selectiva Switch
*
* @author: Mauricio Rodriguez
*/
public class Switch {

	public static void main(String[] args){
		
		String usuario = "usuario";
		
		switch(usuario){
			case "admin": {
				System.out.println("Este usuario es administrador");
				break;
			}
			case "supervisor": {
				System.out.println("Este usuario es supervisor");
				break;
			}
			default: {
				System.out.println("Usuario desconocido");
				break;
			}
			
		}
	
	}
	

}