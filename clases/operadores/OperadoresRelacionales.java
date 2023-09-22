/**
* Programa: Operadores Relacionales
*
* El objetivo de este programa es utilizar los distintos
* operadores Relacionales
*
* @author: Mauricio Rodriguez
*/

public class OperadoresRelacionales {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Operadores Relacionales  #########");
		System.out.println("");
		
		int numA = 5;
		int numB = 8;
		
		// mayor
		boolean cincoMayorQue8 = numA > numB;
		System.out.println("cincoMayorQue8 = " + cincoMayorQue8);
		
		// menor o igual
		boolean cincoMenoIgualQue8 = numA <= numB;
		System.out.println("cincoMenoIgualQue8 = " + cincoMenoIgualQue8);
		
		// distinto
		boolean cincoDistintoA8 = numA != numB;
		System.out.println("cincoDistintoA8 = " + cincoDistintoA8);
		
		// igualdad
		boolean cincoIgualA8 = numA == numB;
		System.out.println("cincoIgualA8 = " + cincoIgualA8);
		
		boolean trueIgualATrue = true == true;
		System.out.println("trueIgualATrue = " + trueIgualATrue);
	}
	

}