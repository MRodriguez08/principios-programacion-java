
/**
* Programa: Tipos Primitivos y Referencias
*
* El objetivo de este programa es utilizar de forma general
* los distintos tipos de datos en Java.
*
* @author: Mauricio Rodriguez
*/
public class PrimitivosYReferencias {
	
	public static void main(String[] args){
		
		// Imprimimos el cabezal
		System.out.println("");
		System.out.println("######### Tipos Primitivos y Referencias (o Wrappers) #########");
		System.out.println("");
		
		// String
		String miString = "Hola Mundo!";
		
		// int
		int edad = 30;
		Integer edadWrapper  = 30;
		
		// short
		short numeroPuerta = 1140;
		Short numeroPuertaWrapper  = 1140;
		
		// long
		long sumaFondosAnuales = 22563215L;
		Long sumaFondosAnualesWrapper  = 22563215L;
		
		// float
		float estatura = 1.82f;
		Float estaturaWrapper  = 1.82f;
		
		// character
		char sexo = 'F';
		Character sexoWrapper  = 'F';
		
		// boolean 
		boolean habilitado = false;
		Boolean habilitadoWrapper = false;
		
		// convertir un entero a String
		String edadString = edadWrapper.toString();
		if (edadString.equals("30")){
			System.out.println("La edad es 30");
		}
		
		// comparar usando equals()
		if (edadWrapper.equals(33)){
			System.out.println("La edad es 33");
		} else {
			System.out.println("La edad NO es 33");
		}
		
		// convertir un float a int
		int estaturaInt = estaturaWrapper.intValue();
		System.out.println("Estatura "+estaturaWrapper+" convertido a Int: " + estaturaInt);
		
	}
	
}