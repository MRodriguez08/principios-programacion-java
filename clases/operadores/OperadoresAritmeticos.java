/**
* Programa: Operadores Aritmeticos
*
* El objetivo de este programa es utilizar los distintos
* operadores aritmeticos
*
* @author: Mauricio Rodriguez
*/

public class OperadoresAritmeticos {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Operadores Aritmeticos  #########");
		System.out.println("");
		
		int numA = 5;
		int numB = 8;
		
		float numC = 5;
		float numD = 8;
		
		// suma
		int resultadoSuma = numA + numB;
		System.out.println("resultadoSuma = " + resultadoSuma);
		
		// diferencia o resta
		int resultadoDiferencia = numA - numB;
		System.out.println("resultadoDiferencia = " + resultadoDiferencia);
		
		// multiplicacion
		int resultadoMultiplicacion = numA * numB;
		System.out.println("resultadoMultiplicacion = " + resultadoMultiplicacion);
		
		// division
		float resultadoDivision = numC / numD;
		System.out.println("resultadoDivision = " + resultadoDivision);
		
		// modulo
		int resultadoModulo = numB % numA;
		System.out.println("resultadoModulo = " + resultadoModulo);
		
	}
	

}