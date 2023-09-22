/**
* Programa: Operadores Asignacion
*
* El objetivo de este programa es utilizar los distintos
* operadores Unitarios
*
* @author: Mauricio Rodriguez
*/

public class OperadoresAsignacion {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Operadores Asignacion  #########");
		System.out.println("");
		
		int numA = 5;
		int numB = 8;
		
		// asignacion
		int num = numA;
		System.out.println("num = " + num);
		
		// suma y asignacion
		// es lo mismo que "numA = numA + 3"
		numA += 3;
		System.out.println("numA = " + numA);
		
		// diferencia y asignacion
		// es lo mismo que "numB = numB - 2"
		numB -= 2 ;
		System.out.println("numB = " + numB);
		
	}
	

}