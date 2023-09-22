/**
* Programa: Operadores Unitarios
*
* El objetivo de este programa es utilizar los distintos
* operadores Unitarios
*
* @author: Mauricio Rodriguez
*/

public class OperadoresUnitarios {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Operadores Unitarios  #########");
		System.out.println("");
		
		int numA = 5;
		int numB = 8;
		
		// negativo
		int menosNumA = -numA;
		System.out.println("menosNumA = " + menosNumA);
		
		// incremento
		numA++ ;
		System.out.println("numA++ = " + numA);
		
		// decremento
		numA-- ;
		System.out.println("numA-- = " + numA);
		
		System.out.println("!(numA > numB) = " + !(numA > numB));
		
	}
	

}