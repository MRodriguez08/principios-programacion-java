
import java.util.ArrayList;

/**
* Programa: Primitivos
*
* El objetivo de este programa es ver el uso y valores iniciales
* de los tipos de datos Referencia.
*
* @author: Mauricio Rodriguez
*/
public class Referencias {
	
	public static final void main(String[] args){
		
		Integer[] calificaciones = new Integer[5];
		Boolean[] habilitados = new Boolean[5];
		Float[] precios = new Float[5];
		Long[] codigos = new Long[5];
		String[] nombres = new String[5];
		
		String primerElemento = nombres[0];
		/*if (primerElemento.equals("pedro")){
			System.out.println("el primer nombre es pedro");
		}*/
		
		System.out.println("### Valor por defecto de primitivos ###");
		System.out.println("Integer: " + calificaciones[0]);
		System.out.println("Boolean: " + habilitados[0]);
		System.out.println("Float: " + precios[0]);
		System.out.println("Long: " + codigos[0]);
		
		Integer calif = 10;
		Float estatura = 1.82f;
		Boolean habilitado = true;
		Long distancia = null;
		System.out.println("### Métodos ###");
		System.out.println("Equals: " + calif.equals(9));
		System.out.println("intValue: " + estatura.intValue());
		System.out.println("toString: " + habilitado.toString());
		
	}
	
}