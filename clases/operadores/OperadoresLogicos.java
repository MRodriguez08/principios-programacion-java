/**
* Programa: Operadores Logicos
*
* El objetivo de este programa es utilizar los distintos
* operadores Logicos
*
* @author: Mauricio Rodriguez
*/

public class OperadoresLogicos {

	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("######### Operadores Logicos  #########");
		System.out.println("");
		
		int numA = 5;
		int numB = 8;
		
		// mayor
		boolean cincoMayorQue8 = numA > numB;
		
		// menor o igual
		boolean cincoMenorIgualQue8 = numA <= numB;
		
		System.out.println("OR: (cincoMayorQue8 || cincoMenorIgualQue8) = " + (cincoMayorQue8 || cincoMenorIgualQue8));
		System.out.println("AND: (cincoMayorQue8 && cincoMenorIgualQue8) = " + (cincoMayorQue8 && cincoMenorIgualQue8));
		System.out.println("NOT: !cincoMayorQue8) = " + !cincoMayorQue8);
	}
	

}